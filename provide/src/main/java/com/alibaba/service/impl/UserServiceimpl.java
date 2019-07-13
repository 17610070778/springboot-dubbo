package com.alibaba.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.entity.User;
import com.alibaba.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王亚奇
 * @date 2019/7/13 9:42
 */
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceimpl implements UserService {
    List<User> users = new ArrayList<User>() {{
        add(new User(18, "小明"));
        add(new User(19, "小刚"));
        add(new User(20, "小英"));
        add(new User(21, "小文"));
    }};

    @Override
    public List<User> findList() {
        return users;
    }

    @Override
    public User findById(Integer id) {
        return users.stream()
                .filter(user -> user.getAge().equals(id))
                .findAny()
                .get();
    }
}
