package com.morty.c137.controller;

import com.github.javafaker.Faker;
import com.morty.c137.biz.MessageBiz;
import com.morty.c137.dao.MessageMapper;
import com.morty.c137.po.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import javax.annotation.Resource;

import static org.hamcrest.Matchers.*;

import java.util.Date;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.BeforeTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class MessageControllerTest extends AbstractTestNGSpringContextTests {


    @Resource
    private MessageMapper messageMapper;

    @Resource
    private MessageBiz messageBiz;

    private MockMvc mockMvc;


    // TODO 解决无法注入该对象
    @Autowired
    private WebApplicationContext context;


    @BeforeTest
    public void prepareData() {

//        Faker faker = new Faker();
//        for (int i = 0; i <= 10; i++) {
//            Message message = new Message();
//            message.setBusinessId("");
//            message.setCreateTime(new Date());
//            message.setUpdateTime(new Date());
//            message.setType("");
//            messageMapper.insertSelective(message);
//        }
//        System.out.println("Now we created 10 items for test");

//        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();

    }

    @AfterTest
    public void cleanTestData() {
        System.out.println("TODO: clean the test data here ");
    }

    @Test
    public void testIndex() throws Exception {

//        mockMvc.perform(get("/message")).andExpect(status().isOk()).andExpect(jsonPath("$.code", is(0)));
    }

    @Test
    public void testGetById() {
    }

    @Test
    public void testSave() {
    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testDelete() {
    }
}