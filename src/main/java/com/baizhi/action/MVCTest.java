package com.baizhi.action;

import com.baizhi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/7/3.
 */
@Controller
@RequestMapping("mvc")
public class MVCTest {

    @RequestMapping("/test1")
    public String test1(String name,Integer age) throws Exception{
        System.out.println(name);
        System.out.println(age);
        return "index";
    }

    @RequestMapping("/test2")
    public String test2 (User user) throws  Exception{
        System.out.println(user);
        return "index";
    }
}
