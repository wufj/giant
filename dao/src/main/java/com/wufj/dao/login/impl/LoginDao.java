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

    public  int loginInset(String username, String password){
        UserVO user = new UserVO();
//        user.setUserId();
        user.setId(200);
        user.setUsername(username);
        user.setPassword(password);
        int result = userMapper.insert(user);
        return result;
    }

}
