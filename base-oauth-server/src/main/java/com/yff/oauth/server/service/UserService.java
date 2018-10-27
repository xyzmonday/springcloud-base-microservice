package com.yff.oauth.server.service;


import com.yff.oauth.server.domain.SysUser;

public interface UserService {

    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}
