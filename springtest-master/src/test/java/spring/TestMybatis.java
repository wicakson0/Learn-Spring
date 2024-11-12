package spring;

import org.example.mybatis.dao.StudentInfoDao;
import org.example.mybatis.repository.JDBCConnection;
import org.example.mybatis.entity.StudentInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 23:03:23
 */
public class TestMybatis {
    private ApplicationContext applicationContext;

    @Before
    public void setup() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testJDBC() {
        JDBCConnection jdbcConnection = new JDBCConnection();
        StudentInfo one = jdbcConnection.getOne(1);
        System.out.println(one);
    }

    @Test
    public void testFindUserById() throws Exception {
        // 通过配置资源对象获取 userDAO 对象
        StudentInfoDao studentInfoDao = applicationContext.getBean(StudentInfoDao.class);
        // 调用 UserDAO 的方法
        StudentInfo studentInfo = studentInfoDao.findStudentById(1L);
        // 输出用户信息
        System.out.println(studentInfo.getStuId() + ":" + studentInfo.getStuName());
    }
}
