package com.lvxk.provider.controller;

import com.lvxk.provider.dao.UserRepository;
import com.lvxk.provider.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findeById(@PathVariable Long id){
        User findOne=userRepository.findById(id).get();
        return  findOne;
    }
}
