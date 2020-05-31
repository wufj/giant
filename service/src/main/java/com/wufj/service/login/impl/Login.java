package com.wufj.service.login.impl;

import com.wufj.dao.login.IloginDao;
import com.wufj.service.login.Ilogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Login implements Ilogin {

    @Autowired
    public IloginDao loginDao;

    @Override
    public int login(String username, String password) {
        int result = loginDao.loginInset(username,password);
        return result;
    }
}
