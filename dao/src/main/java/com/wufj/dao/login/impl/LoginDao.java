package com.wufj.dao.login.impl;

import com.wufj.dao.login.IloginDao;
import com.wufj.dao.mapper.UserMapper;
import com.wufj.dao.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginDao  implements IloginDao {

    @Autowired
    private UserMapper userMapper;

    public  boolean loginInset(String username, String password){
        UserVO user = new UserVO();
//        user.setUserId();
        user.setId(100L);
        user.setUsername(username);
        user.setPassword(password);
        boolean result = userMapper.insertUser(user);
        return result;
    }

}
