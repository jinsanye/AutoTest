package com.asiainfo.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("SuiteConfig.beforeSuite运行了！");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("SuiteConfig.afterSuite运行了！");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("SuiteConfig.beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("SuiteConfig.afterTest");
    }
}
