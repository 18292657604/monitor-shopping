package com.musingtec.bean;

import java.io.Serializable;

/**
 * Created by LSY on 2018/8/27.
 */
public class Student implements Serializable {

    private Integer id;
    private String name;

    public Student() {
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
