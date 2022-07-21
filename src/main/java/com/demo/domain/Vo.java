package com.demo.domain;

import java.util.List;

public class Vo {

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    private List<User> list;

    @Override
    public String toString() {
        return "Vo{" +
                "list=" + list +
                '}';
    }
}
