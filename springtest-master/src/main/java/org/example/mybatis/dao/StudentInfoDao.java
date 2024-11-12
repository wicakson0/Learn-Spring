package org.example.mybatis.dao;

import org.example.mybatis.entity.StudentInfo;

public interface StudentInfoDao {

    StudentInfo findStudentById(Long stuId);

}
