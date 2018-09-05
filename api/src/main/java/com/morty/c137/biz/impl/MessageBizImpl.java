package com.morty.c137.biz.impl;

import com.github.pagehelper.PageInfo;
import com.morty.c137.biz.MessageBiz;
import com.morty.c137.dto.PageableDto;
import com.morty.c137.po.Message;
import org.springframework.stereotype.Service;



@Service
public class MessageBizImpl implements MessageBiz {

    @Override
    public Message getById(int id) {
        return null;
    }

    @Override
    public PageInfo<Message> list(PageableDto pageableDto) {
        return null;
    }

    @Override
    public Message save(Message job) {
        return null;
    }

    @Override
    public Message update(Message job) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
