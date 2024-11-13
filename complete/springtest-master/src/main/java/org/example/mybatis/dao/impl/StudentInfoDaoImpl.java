package org.example.mybatis.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.example.mybatis.dao.StudentInfoDao;
import org.example.mybatis.entity.StudentInfo;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.Date;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-11 08:22:10
 */
public class StudentInfoDaoImpl extends SqlSessionDaoSupport implements StudentInfoDao {
    @Override
    public StudentInfo findStudentById(Long stuId) {
        // 继承 SqlSessionDaoSupport 类，通过 this.getSqlSession() 得到 sqlSession
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.selectOne("org.example.mybatis.dao.StudentInfoDao.findStudentById", stuId);
    }
    public int insertStudent(StudentInfo student) {
        // 继承 SqlSessionDaoSupport 类，通过 this.getSqlSession() 得到 sqlSession
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.insert("org.example.mybatis.dao.StudentInfoDao.insertStudent", student);
    }

    public int updateStudent(Long newStuId, String newStuName, String newSex, Date newDate) {
        SqlSession sqlSession = this.getSqlSession();

        StudentInfo updatedStudent = new StudentInfo();
        updatedStudent.setStuId(newStuId);
        updatedStudent.setStuName(newStuName);
        updatedStudent.setSex(newSex);
        updatedStudent.setBirthdate(newDate);

        return sqlSession.update("org.example.mybatis.dao.StudentInfoDao.updateStudent", updatedStudent);
    }

    public int deleteStudent(Long StuId) {
        SqlSession sqlSession = this.getSqlSession();

        return sqlSession.delete("org.example.mybatis.dao.StudentInfoDao.deleteStudent", StuId);
    }

}
