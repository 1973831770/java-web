package com.dao;

import com.bean.Admin;

import java.util.List;

public interface Adminint {


    public void insert();

    public List<Admin> findall();

    public void update();

    public void delete();
}