package com.morty.c137.controller;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class JobControllerTest extends AbstractTestNGSpringContextTests {

    @Test
    public void testIndex() {
        Assert.assertEquals(1,1);
    }
}