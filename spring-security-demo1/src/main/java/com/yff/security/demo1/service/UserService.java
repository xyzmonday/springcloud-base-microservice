package com.yff.security.demo1.service;

import com.yff.security.demo1.entity.SysUser;

public interface UserService {

    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}