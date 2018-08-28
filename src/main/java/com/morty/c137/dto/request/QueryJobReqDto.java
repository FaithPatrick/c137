package com.morty.c137.dto.request;

import java.io.Serializable;

public class QueryJobReqDto {

//    private static final long serialVersionUID = -774844185816964567L;

    private Integer id;

    private String name;

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
