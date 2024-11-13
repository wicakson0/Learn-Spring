package org.example.spring.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 20:20:06
 */
@Getter
@Setter
@Component(value = "student")
public class Student {
    @Value("1")
    private int stuId;
    @Value("Stu1")
    private String stuNumber;
    @Value("Chou")
    private String stuName;
}