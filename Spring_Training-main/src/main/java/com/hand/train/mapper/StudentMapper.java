package com.hand.train.mapper;

import com.hand.train.po.Student;
import com.hand.train.service.StudentService;

import java.util.List;

public interface StudentMapper {
    List<Student> getAll();
    Student getById(int stuId);
    Student getLastInput(Student student);
    int addStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(int stuId);
}
