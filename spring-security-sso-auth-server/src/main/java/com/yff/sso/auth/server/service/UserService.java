package com.yff.sso.auth.server.service;


import com.yff.sso.auth.server.domain.SysUser;

public interface UserService {

    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}
