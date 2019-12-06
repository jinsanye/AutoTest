package com.asiainfo.testng;

import org.testng.annotations.*;

public class BasicAnnotations  {

    @Test
    public void testCase1(){
        System.out.printf("Basic Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试案例1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Basic Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试案例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BasicAnnotation.beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("BasicAnnotation.afterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BasicAnnotation.beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("BasicAnnotation.afterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BasicAnnotations.beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("BasicAnnotations.afterSuite");
    }

}

