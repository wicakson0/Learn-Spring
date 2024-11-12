// src/main/java/com/example/service/UserService.java
package com.example.mybatis_demo.service;

import com.example.mybatis_demo.mapper.StudentMapper;
import com.example.mybatis_demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private final StudentMapper studentMapper;

    @Autowired
    public StudentService(StudentMapper userMapper) {
        this.studentMapper = userMapper;
    }

    public List<Student> getAllStudents() {
        return studentMapper.findAllUsers();
    }
}
