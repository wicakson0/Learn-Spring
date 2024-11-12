package com.hand.train.service;

import com.hand.train.po.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student getById(int id);
    Student addStudent(Student newStudent);
    Student updateStudent(Student student);
    Student deleteStudent(int id);
}
