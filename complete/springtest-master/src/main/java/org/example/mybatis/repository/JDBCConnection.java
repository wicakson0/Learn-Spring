package org.example.mybatis.repository;

import org.example.mybatis.entity.StudentInfo;
import org.example.mybatis.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 22:46:09
 */
public class JDBCConnection {
    public StudentInfo getOne(int id) {
        String sql = "SELECT stu_id,stu_name,sex,birthdate FROM student_info WHERE stu_id = ?";
        StudentInfo student = null;
        // Declare JDBC variables
        // Get Connection and Precompiled SQL
        try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Set parameters
            ps.setInt(1, id);
            // Execute SQL
            ResultSet rs = ps.executeQuery();
            // 组装结果集返回 POJO
            if (rs.next()) {
                student = new StudentInfo();
                student.setStuId(rs.getLong(1));
                student.setStuName(rs.getString(2));
                student.setSex(rs.getString(3));
                student.setBirthdate(rs.getDate(4));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
}
