package org.example.mybatis.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 22:49:59
 */
@Getter
@Setter
@ToString
public class StudentInfo {
    private Long stuId;
    private String stuName;
    private String sex;
    private Date birthdate;
}
