package com.morty.c137.biz.impl;

import com.github.pagehelper.PageInfo;
import com.morty.c137.biz.MessageBiz;
import com.morty.c137.dto.PageableDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class MessageBizImpl implements MessageBiz {

    @Override
    public com.morty.c137.po.Resource getById(int id) {
        return null;
    }

    @Override
    public PageInfo<com.morty.c137.po.Resource> list(PageableDto pageableDto) {
        return null;
    }

    @Override
    public com.morty.c137.po.Resource save(com.morty.c137.po.Resource job) {
        return null;
    }

    @Override
    public com.morty.c137.po.Resource update(com.morty.c137.po.Resource job) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
