package com.example.demo;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}

	//executes after the spring beans have been loaded
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner->{
			//createdStudent(studentDao);
			//createMultipleStudents(studentDao);
			//readStudent(studentDao);
			//queryForStudent(studentDao);
			//updateStudent(studentDao);
			//updateAllStudent(studentDao);
			//deleteStudent(studentDao);
			deleteAllStudent(studentDao);
		};
	}

	private void deleteAllStudent(StudentDao studentDao) {
		System.out.println("Deleting all students");
		int deletedStuends = studentDao.deleteAll();
		System.out.println("Deleted count: "+deletedStuends);
	}

	private void deleteStudent(StudentDao studentDao) {
		int studentId = 1;
		studentDao.delete(1);
	}

	private void updateAllStudent(StudentDao studentDao) {
		studentDao.updateAll();
	}

	private void updateStudent(StudentDao studentDao) {
		int id = 1;
		Student theStudent = studentDao.findById(1);
		theStudent.setFirstName("tharunkkk");
		studentDao.update(theStudent);
	}

	private void queryForStudent(StudentDao studentDao) {
		List<Student> theStudents = studentDao.findAll();

		for(Student tempStudents: theStudents){
			System.out.println(tempStudents);
		}
	}

	private void readStudent(StudentDao studentDao) {
		System.out.println("Creating new student object.....");
		Student tempStudent = new Student("kumar","k","@gmail.com");

		System.out.println("Saving student....");
		studentDao.save(tempStudent);

		int theId = tempStudent.getId();
		Student myStudent = studentDao.findById(theId);
		System.out.println("Retrived student by ID:" + myStudent);


	}

	private void createMultipleStudents(StudentDao studentDao) {
		System.out.println("Creating 3 new student object.....");
		Student tempStudent1 = new Student("tharun","k","@gmail.com");
		Student tempStudent2 = new Student("tharunk","kk","@gmail.com");
		Student tempStudent3 = new Student("tharunChowdary","kkk","@gmail.com");

		System.out.println("Saving students....");
		studentDao.save(tempStudent1);
		studentDao.save(tempStudent2);
		studentDao.save(tempStudent3);

		System.out.println("Saved student Generated ID:" + tempStudent1.getId());
	}

	private void createdStudent(StudentDao studentDao) {
		System.out.println("Creating new student object.....");
		Student tempStudent = new Student("tharun","k","@gmail.com");

		System.out.println("Saving student....");
		studentDao.save(tempStudent);

		System.out.println("Saved student Generated ID:" + tempStudent.getId());
	}

}
