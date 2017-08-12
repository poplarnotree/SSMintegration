package org.spring.service.impl;

import org.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service("user")
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String loginname, String password) {
        System.out.println("调用UserServiceImpl方法");
        System.out.println(loginname);
        if(loginname.equals("admin")&&password.equals("123456")){
            return true;
        }else{
            return false;
        }
    }
}
