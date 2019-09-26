package com.kinson.bat.controller;

import com.kinson.bat.service.UserService;
import com.kinson.comm.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 文件描述
 **/
@Controller
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserService userService;

    @GetMapping(value = "listUsers")
    @ResponseBody
    public List<User> listUsers() {
        return userService.listUser();
    }
}
