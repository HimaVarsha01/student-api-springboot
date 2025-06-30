package com.student.example.controller;

import com.student.example.model.Student;
import com.student.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getstudent(@PathVariable Integer id)
    {
        Student student = studentService.getstudent(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping("student")
    public ResponseEntity<Student> save(@RequestBody Student student)
    {
        Student s = studentService.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(s);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deletestudent(@PathVariable Integer id)
    {
       studentService.deletestudent(id);
        return ResponseEntity.ok("Student deleted succesfully");

    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }



}


