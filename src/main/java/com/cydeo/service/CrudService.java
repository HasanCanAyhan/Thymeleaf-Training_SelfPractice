package com.cydeo.service;

import com.cydeo.model.User;

import java.util.List;

public interface CrudService<T> {

    List<T> findAllUsers();

    void save(T object);

}
