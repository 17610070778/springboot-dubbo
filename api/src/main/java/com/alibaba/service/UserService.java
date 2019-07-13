package com.alibaba.service;

import com.alibaba.entity.User;

import java.util.List;

/**
 * @author 王亚奇
 * @date 2019/7/13 9:41
 */
public interface UserService {
    List<User> findList();

    User findById(Integer id);
}
