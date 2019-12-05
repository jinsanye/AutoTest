package com.asiainfo.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("IgnoreTest.ignore1执行了");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("IgnoreTest.ignore2执行了");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("IgnoreTest.ignore3执行了");
    }
}
