package com.example.demo.dao;

import com.example.demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class StudentDaoImpl implements StudentDao{

    final private EntityManager entityManager;
    @Autowired
    public  StudentDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM student", Student.class);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void updateAll() {
        entityManager.createQuery("UPDATE student SET lastName='tester'").executeUpdate();
    }

    @Override
    @Transactional //since we are updating the data base for all writing/updating/deleting trasaction we need to add this annotation
    public void delete(int id) {
        Student theStudent = entityManager.find(Student.class,id);
        entityManager.remove(theStudent);

    }

    @Override
    @Transactional
    public int deleteAll() {
       return entityManager.createQuery("DELETE FROM student").executeUpdate();
    }
}
