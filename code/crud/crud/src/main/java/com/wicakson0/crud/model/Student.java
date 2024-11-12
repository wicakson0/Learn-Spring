package com.wicakson0.crud.model;

import jakarta.persistence.*;

@Entity
public class Student {
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student(){

    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;
    private Integer age;
}
