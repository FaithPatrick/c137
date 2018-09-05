package com.morty.c137.biz.impl;

import com.github.pagehelper.PageInfo;
import com.morty.c137.biz.JobBiz;
import com.morty.c137.dao.JobMapper;
import com.morty.c137.dto.request.QueryJobReqDto;
import com.morty.c137.po.Job;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;
import java.util.Date;

@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class JobBizImplTest extends AbstractTestNGSpringContextTests {

    @Resource
    private JobMapper jobMapper;

    @Resource
    private JobBiz jobBiz;

    @Test
    public void testSaveJob() {

        int id = 1;
        Job job = new Job();
        Job theJob = jobMapper.selectByPrimaryKey(id);
        if (theJob == null) {
            job.setId(id);
            job.setCreateTime(new Date());
            job.setUpdateTime(new Date());
            job.setDescription("Desc");
            job.setName("Name");
            int refNu = jobMapper.insertSelective(job);
            Assert.assertEquals(refNu, 1);
        } else {
            Assert.assertEquals(theJob.getId().intValue(), 1);
        }
    }

    @Test
    public void testGetJob() {
    }


    @Test
    public void testUpdateJob() {
    }

    @Test
    public void testDeleteJob() {
    }

    @Test
    public void testListJobPaging() {
        int id = 1;
        // make sure id exists
        this.makeSureJobExists(id);
        QueryJobReqDto queryJobReqDto=new QueryJobReqDto();
        queryJobReqDto.setId(id);
        PageInfo<Job> jobs=jobBiz.listJobPaging(queryJobReqDto);
        Assert.assertEquals(jobs.getTotal(),1);
    }

    private Job makeSureJobExists(int id) {

        Job job = new Job();
        Job theJob = jobMapper.selectByPrimaryKey(id);
        if (theJob == null) {
            job.setId(id);
            job.setCreateTime(new Date());
            job.setUpdateTime(new Date());
            job.setDescription("Desc");
            job.setName("Name");
            jobMapper.insertSelective(job);
            return job;
        } else {
            return theJob;
        }
    }
}