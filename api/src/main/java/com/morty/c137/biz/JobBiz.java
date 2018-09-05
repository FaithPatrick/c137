package com.morty.c137.biz;

import com.github.pagehelper.PageInfo;
import com.morty.c137.dto.request.QueryJobReqDto;
import com.morty.c137.po.Job;

public interface JobBiz {

    public Job getJob(int id);

    public PageInfo<Job> listJobPaging(QueryJobReqDto queryJobReqDto);

    public Boolean saveJob(Job job);

    public Boolean updateJob(Job job);

    public Boolean deleteJob(int id);
}
