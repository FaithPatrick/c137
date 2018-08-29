package com.morty.c137.biz.impl;

import com.morty.c137.biz.UserBiz;
import com.morty.c137.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserBizImpl implements UserBiz {

    @Resource
    private UserMapper userMapper;
}
