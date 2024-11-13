package org.example.spring.service;

import org.example.spring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 20:49:04
 */
@Component("studentService")
public class StudentService {
    @Autowired
    private Student student;

    public String getInformation() {
        return "Student Info 3: " + String.join(",", String.valueOf(student.getStuId()), student.getStuNumber(), student.getStuName());
    }
}
