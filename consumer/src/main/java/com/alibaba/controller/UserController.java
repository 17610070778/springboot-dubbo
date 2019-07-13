package com.alibaba.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.entity.User;
import com.alibaba.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 王亚奇
 * @date 2019/7/13 9:47
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping("/list")
    public List<User> findList(){
        return userService.findList();
    }
    @GetMapping("/list/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

}
