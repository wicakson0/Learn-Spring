package com.example.mybatis_demo.controller;

import com.example.mybatis_demo.model.Student;
import com.example.mybatis_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/users")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
