package com.morty.c137.util;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;


public class RedisUtil {

    @Resource
    private JedisPool jedisPool;

    public void ping() {

         jedisPool.getResource().ping();
    }

}
