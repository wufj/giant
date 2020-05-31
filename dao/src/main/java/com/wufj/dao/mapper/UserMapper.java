package com.wufj.dao.mapper;


import com.wufj.dao.vo.UserVO;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {

//    @Insert
    int insert(UserVO user );

}

