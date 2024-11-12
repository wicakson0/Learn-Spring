package com.example.mybatis_demo.model;

import java.util.Date;

public class Student {
    private int stu_id;
    private String stu_name;
    private String sex;
    private Date birthdate;

    public Student(int stu_id, String stu_name, String sex, Date birthdate) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.sex = sex;
        this.birthdate = birthdate;
    }

    public Student() {
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
