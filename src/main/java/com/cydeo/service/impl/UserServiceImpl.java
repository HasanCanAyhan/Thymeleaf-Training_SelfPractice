package com.cydeo.service.impl;

import com.cydeo.model.User;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {


    @Override
    public List<User> findAllUsers() {
        return super.findAllUsers();
    }

    @Override
    public void save(User user) {
        super.save(user);
    }
}
