package com.lipeng.controller;

import com.lipeng.bean.User;
import com.lipeng.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by dllo on 18/2/26.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "register")
    public String register() {
        return "register";
    }




    @RequestMapping(value = "doregister")
    public String doregister(@Param("name") String name, @Param("pwd") String pwd,@Param("desc") String desc,@Param("tel") String tel,@Param("address") String address) {
        User user = new User(name, pwd,desc,tel,address);
        userService.register(user);
        return "login";
    }


    @RequestMapping(value = "dologin")
     public String dologin(@Param("name") String name, @Param("pwd") String pwd, Model model, HttpServletRequest request) {
        User user = new User(name, pwd);
        User newUser = userService.login(user);
        request.getSession().setAttribute("Id",newUser.getId());
        request.getSession().setAttribute("Name",newUser.getName());
        return "redirect:home";
    }

}
