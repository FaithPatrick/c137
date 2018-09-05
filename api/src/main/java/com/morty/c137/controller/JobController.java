package com.morty.c137.controller;

import com.github.pagehelper.PageInfo;
import com.morty.c137.biz.JobBiz;
import com.morty.c137.core.Result;
import com.morty.c137.core.ResultGenerator;
import com.morty.c137.dto.request.QueryJobReqDto;
import com.morty.c137.po.Job;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/job")
public class JobController {

    @Resource
    private JobBiz jobBiz;


    @GetMapping
    public Result index(QueryJobReqDto queryJobReqDto) {
        PageInfo jobs = jobBiz.listJobPaging(queryJobReqDto);
        return ResultGenerator.genSuccessResult(jobs);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") Integer id){
        Job job = jobBiz.getJob(id);
        return ResultGenerator.genSuccessResult(job);
    }

    @PostMapping
    public Result add(@RequestParam("name") String name, @RequestParam("desc") String desc) {
        Job job = new Job();
        job.setName(name);
        job.setDescription(desc);
        job.setUpdateTime(new Date());
        job.setCreateTime(new Date());
        if (jobBiz.saveJob(job)) {
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("添加失败");
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable("id") Integer id, @RequestParam("name") String name,
                         @RequestParam("desc") String desc) {
        Job job = jobBiz.getJob(id);
        job.setName(name);
        job.setDescription(desc);
        job.setUpdateTime(new Date());
        if (jobBiz.updateJob(job)) {
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("更新失败");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id) {
        if (jobBiz.deleteJob(id)) {
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("删除失败");
    }
}
