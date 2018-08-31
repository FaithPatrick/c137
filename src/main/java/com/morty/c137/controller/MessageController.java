package com.morty.c137.controller;

import com.github.pagehelper.PageInfo;
import com.morty.c137.biz.MessageBiz;
import com.morty.c137.core.Result;
import com.morty.c137.core.ResultGenerator;
import com.morty.c137.dto.PageableDto;
import com.morty.c137.po.Message;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/message")
public class MessageController  {

    /**
     * 消息类， job的结果会生成统一的消息模型，并持久到数据库中
     * 方便滚动查看当前的消息列表
     * TODO 消息可以被订阅
     *
     */
    @Resource
    private MessageBiz messageBiz;

    @GetMapping
    public Result index(PageableDto pageableDto) {
        PageInfo jobs = messageBiz.list(pageableDto);
        return ResultGenerator.genSuccessResult(jobs);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") Integer id) {
        Message resource = messageBiz.getById(id);
        return ResultGenerator.genSuccessResult(resource);
    }

    @PostMapping
    public Result save(Message resource) {
        if (messageBiz.save(resource) != null) {
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("添加失败");
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable("id") Integer id, Message resource) {
        if (messageBiz.update(resource) != null) {
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("更新失败");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") int id) {
        if (messageBiz.delete(id)) {
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("删除失败");
    }
}
