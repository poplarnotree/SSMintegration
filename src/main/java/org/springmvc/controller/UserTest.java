package org.springmvc.controller;

import org.dao.UserDao;
import org.dao.impl.UserMapperImpl;
import org.domain.TbUser;
import org.domain.User;
import org.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserTest {

    @Autowired
//    @Qualifier("user")
//    private UserService userService;
    @Qualifier("userdao")
    private UserDao userDao;

    @RequestMapping(value = "test",method = RequestMethod.POST)
    public String tset(@Validated TbUser user){
//        if (user.getUsername().equals("admin")&&user.getPassword().equals("123456")){
//            return "success";
//        }else{
//            return "login";
//        }
//        if(userService.login(user.getLoginname(),user.getPassword())){
//            return "success";
//        }else {
//            return "login";
//        }
//        使用UserDao
//        boolean flag = userDao.queryByLoginname(user.getLoginname(),user.getPassword());
//        if (flag){
//            return "success";
//        }else{
//            return "login";
//        }
//        使用UserMapper
        UserMapperImpl userMapper = new UserMapperImpl();
        boolean flag = userMapper.queryUserLogin(user.getLoginname(),user.getPassword());
        if (flag){
            return "success";
        }else{
            return "login";
        }
    }
}
