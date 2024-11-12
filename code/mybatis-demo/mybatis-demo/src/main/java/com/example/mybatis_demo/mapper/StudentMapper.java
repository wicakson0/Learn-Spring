package com.example.mybatis_demo.mapper;

import com.example.mybatis_demo.model.Student;
import java.util.List;

public interface StudentMapper {
    List<Student> findAllUsers();
}
