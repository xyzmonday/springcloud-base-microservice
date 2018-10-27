package com.yff.oauth.server.service.impl;

import com.yff.oauth.server.dao.UserDao;
import com.yff.oauth.server.domain.SysUser;
import com.yff.oauth.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
