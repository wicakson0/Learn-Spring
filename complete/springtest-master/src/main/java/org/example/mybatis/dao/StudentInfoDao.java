package org.example.mybatis.dao;

import org.example.mybatis.entity.StudentInfo;

import java.util.Date;

public interface StudentInfoDao {

    StudentInfo findStudentById(Long stuId);
    int insertStudent(StudentInfo student);
    int updateStudent(Long stuId, String stuName, String sex, Date birthdate);
    int deleteStudent(Long stuId);
}
