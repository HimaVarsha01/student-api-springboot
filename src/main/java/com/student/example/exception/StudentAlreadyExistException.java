package com.student.example.exception;

public class StudentAlreadyExistException extends RuntimeException{
    public StudentAlreadyExistException(String message){
        super(message);
    }
}
