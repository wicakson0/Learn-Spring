package com.hand.train.controller;

import com.hand.train.po.Student;
import com.hand.train.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/test")
    public String test(){
        System.out.println("Test");
        return "test";
    }

    @ApiOperation(value = "student get all")
    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll();

    }

    @ApiOperation(value = "student get all")
    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable(name = "id") int id){
        return studentService.getById(id);
    }

    @ApiOperation(value = "student add")
    @PostMapping
    public Student create(@RequestBody Student student){
        Student student1 = studentService.addStudent(student);
        return student1;
    }

    @ApiOperation(value = "update student")
    @PutMapping("/update/{id}")
    public Student update(@PathVariable(name = "id") int id, @RequestBody Student student){
        student.setStuId(id);
        Student student1 = studentService.updateStudent(student);
        return student1;
    }

    @ApiOperation(value = "delete student")
    @DeleteMapping("/delete/{id}")
    public Student delete(@PathVariable(name = "id") int id){
        return studentService.deleteStudent(id);
    }
}
