package spring;

import org.example.mybatis.dao.StudentInfoDao;
import org.example.mybatis.repository.JDBCConnection;
import org.example.mybatis.entity.StudentInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    @Test
    public void testInsertStudent() throws Exception {
        // 通过配置资源对象获取 userDAO 对象
        StudentInfoDao studentInfoDao = applicationContext.getBean(StudentInfoDao.class);

        String dateString = "2024-01-02";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        StudentInfo student = new StudentInfo();
        student.setStuId(2L);
        student.setStuName("Bagas");
        student.setSex("Male");
        Date birthdate = formatter.parse(dateString);
        student.setBirthdate(birthdate);

        long statusCode = studentInfoDao.insertStudent(student);
        System.out.println("Inserted new user with statusCode: " + statusCode);
        // 调用 UserDAO 的方法
    }
    @Test
    public void testUpdateStudent() throws Exception {
        StudentInfoDao studentInfoDao = applicationContext.getBean(StudentInfoDao.class);

        String dateString = "2000-01-02";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        StudentInfo studentInfo = studentInfoDao.findStudentById(1L);

        StudentInfo newStudent = new StudentInfo();
        newStudent.setStuId(studentInfo.getStuId());
        newStudent.setStuName("bagas");
        newStudent.setSex("male");

        Date newBirthdate = formatter.parse(dateString);
        newStudent.setBirthdate(newBirthdate);
        newStudent.setBirthdate(newBirthdate);

        long statusCode = studentInfoDao.updateStudent(newStudent.getStuId(), newStudent.getStuName(),
                                                        newStudent.getSex(), newStudent.getBirthdate());
        System.out.println("Inserted new user with statusCode: " + statusCode);
    }

    @Test
    public void testDeleteStudent() throws Exception {
        StudentInfoDao studentInfoDao = applicationContext.getBean(StudentInfoDao.class);
        Long studentId = 2L;
        long statusCode = studentInfoDao.deleteStudent(studentId);
        System.out.println("Deleted user with statusCode: " + statusCode);
    }
}
