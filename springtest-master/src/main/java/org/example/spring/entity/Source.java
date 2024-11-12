package org.example.spring.entity;

import lombok.ToString;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-07 10:46:07
 */
@ToString
public class Source {
    private String fruit;
    private String sugar;
    private String size;

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}