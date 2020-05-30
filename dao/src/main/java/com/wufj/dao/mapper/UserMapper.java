package com.wufj.dao.mapper;


import com.wufj.dao.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    boolean insertUser(UserVO user );

}

