package org.example.mybatis.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.example.mybatis.dao.StudentInfoDao;
import org.example.mybatis.entity.StudentInfo;
import org.mybatis.spring.support.SqlSessionDaoSupport;

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
}
