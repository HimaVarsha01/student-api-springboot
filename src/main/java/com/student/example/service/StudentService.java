package com.student.example.service;

import com.student.example.exception.StudentNotFoundException;
import com.student.example.model.Student;
import com.student.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentrepository;


    public Student getstudent(Integer id) {
        return studentrepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found"));
    }

    public Student save(Student student) {
        return studentrepository.save(student);
    }

    public void deletestudent(Integer id) {
        studentrepository.deleteById(id);
    }

    public List<Student> getAllStudents() {
       return studentrepository.findAll();
    }
}
