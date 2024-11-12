package com.hand.train.service.impl;

import com.hand.train.mapper.StudentMapper;
import com.hand.train.po.Student;
import com.hand.train.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.getAll();
    }

    @Override
    @Cacheable(value = "Student", key = "#id")
    public Student getById(int id) {
        return studentMapper.getById(id);
    }

    @Override
    @CachePut(value = "Student", key = "#{newStudent.stuId}")
    public Student addStudent(Student newStudent) {
        if(studentMapper.addStudent(newStudent)>0){
            System.out.println("Success");
            return studentMapper.getLastInput(newStudent);
        }else {
            System.out.println("Failed");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public Student updateStudent(Student student) {
        if(studentMapper.updateStudent(student)>0){
            System.out.println("Success");
            return studentMapper.getLastInput(student);
        }else {
            System.out.println("Failed");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    @CacheEvict(value = "student", key = "#{id}")
    public Student deleteStudent(int id) {
        Student student = getById(id);
        studentMapper.deleteStudent(id);
        return student;
    }
}
