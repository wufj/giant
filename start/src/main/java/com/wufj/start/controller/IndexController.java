package com.wufj.start.controller;

//import com.wufj.service.login.Ilogin;

import com.wufj.service.login.Ilogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private Ilogin loginTool;

    @RequestMapping(value = "hello",method = RequestMethod.POST)
    @ResponseBody
    private  Object login( String username, String password){
        String name = username;
        String pass = password;
        boolean result = loginTool.login(name, pass);
        return  result;
    }
}
