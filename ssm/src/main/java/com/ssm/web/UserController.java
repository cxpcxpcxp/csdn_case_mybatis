package com.ssm.web;

import com.ssm.pojo.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
//    springmvc和spring测试
    @RequestMapping("/userHello")
    public String userHello(User user){
        System.out.println("user==>"+user);
        return "ok";
    }

    //    ssm测试
    @RequestMapping("/userList")
    public ModelAndView userHello(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> userLists = userService.findAll();
        modelAndView.setViewName("userList");
        modelAndView.addObject("list",userLists);
        return modelAndView;
    }
}
