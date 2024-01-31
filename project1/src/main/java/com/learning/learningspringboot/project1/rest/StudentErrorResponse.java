package com.learning.learningspringboot.project1.rest;

public class StudentErrorResponse {
    private int status;
    private String message;
    private long timeStamo;

    public StudentErrorResponse() {
    }

    public int getStatus() {
        return status;
    }

    public StudentErrorResponse(int status, String message, long timsStamo) {
        this.status = status;
        this.message = message;
        this.timeStamo = timsStamo;
    }

    @Override
    public String toString() {
        return "StudentErrorResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", timsStamo=" + timeStamo +
                '}';
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamo() {
        return timeStamo;
    }

    public void setTimeStamo(long timeStamo) {
        this.timeStamo = timeStamo;
    }
}
