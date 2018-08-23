package com.morty.c137.util;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;


@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class RedisUtilTest extends AbstractTestNGSpringContextTests {

    @Test
    public void testPing() {
        RedisUtil redisUtil=new RedisUtil();
        // TODO
    }
}