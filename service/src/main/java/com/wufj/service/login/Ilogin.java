package com.wufj.service.login;

import org.springframework.stereotype.Repository;

@Repository
public interface Ilogin {

      int login(String username, String password);

}
