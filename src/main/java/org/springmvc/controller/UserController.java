package org.springmvc.controller;

import org.domain.TbUser;
import org.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName,Model model){
        TbUser user = new TbUser();
        model.addAttribute("user",user);
        return formName;
    }
}
