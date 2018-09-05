package com.morty.c137.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.morty.c137.biz.JobBiz;
import com.morty.c137.dao.JobMapper;
import com.morty.c137.dto.request.QueryJobReqDto;
import com.morty.c137.po.Job;
import com.morty.c137.util.Util;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobBizImpl implements JobBiz {

    @Resource
    private JobMapper jobMapper;

    /**
     * get a job
     *
     * @param id
     * @return
     */
    @Override
    public Job getJob(int id) {
        return jobMapper.selectByPrimaryKey(id);
    }

    /**
     * save a job
     *
     * @param job
     * @return
     */
    @Override
    public Boolean saveJob(Job job) {
        if (job == null) {
            return false;
        }
        return jobMapper.insertSelective(job) > 0;
    }

    /**
     * update a job
     *
     * @param job
     * @return
     */
    @Override
    public Boolean updateJob(Job job) {
        return jobMapper.updateByPrimaryKey(job) > 0;
    }

    /**
     * delete a job
     *
     * @param id
     * @return
     */
    @Override
    public Boolean deleteJob(int id) {
        return jobMapper.deleteByPrimaryKey(1) > 0;
    }

    @Override
    public PageInfo<Job> listJobPaging(QueryJobReqDto queryJobReqDto) {

        int pageNum = 1;
        int pageSize = 20;

        // 引入的分页组件
        //此语句之后后，会拦截之后的第一条SQL查询，注入分页参数进行分页
        PageHelper.startPage(pageNum, pageSize);
        // example 简单查询 (tk-mapper封装的,非官方,非常好用,简单查询就可以用这个)
        Example example = new Example(Job.class);
        Example.Criteria criteria = example.createCriteria();
        if (!Util.isEmpty(queryJobReqDto.getId())) {
            criteria.andEqualTo("id", queryJobReqDto.getId());
        }
        if (!Util.isEmpty(queryJobReqDto.getName())) {
            criteria.andEqualTo("name", queryJobReqDto.getName());
        }
        List<Job> jobs= jobMapper.selectByExample(example);
        return new PageInfo<>(jobs);
    }
}
