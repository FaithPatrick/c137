package com.morty.c137.biz;

import com.github.pagehelper.PageInfo;
import com.morty.c137.dto.PageableDto;
import com.morty.c137.po.Message;

public interface MessageBiz {

    public Message getById(int id);

    public PageInfo<Message> list(PageableDto pageableDto);

    public Message save(Message job);

    public Message update(Message job);

    public Boolean delete(int id);
}
