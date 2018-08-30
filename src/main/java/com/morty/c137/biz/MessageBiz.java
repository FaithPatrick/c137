package com.morty.c137.biz;

import com.github.pagehelper.PageInfo;
import com.morty.c137.dto.PageableDto;
import com.morty.c137.po.Resource;

public interface MessageBiz {

    public Resource getById(int id);

    public PageInfo<Resource> list(PageableDto pageableDto);

    public Resource save(Resource job);

    public Resource update(Resource job);

    public Boolean delete(int id);
}
