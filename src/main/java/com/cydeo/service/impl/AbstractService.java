package com.cydeo.service.impl;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractService<T> {

    //public Map<ID,T> map = new HashMap<>(); //DB custom database
    public final List<T> USER_LIST = new ArrayList<>();

    List<T> findAllUsers(){
        return USER_LIST;
    }

    public void save(T object){
        USER_LIST.add(object);
    }

}
