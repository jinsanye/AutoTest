package com.asiainfo.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void testA(){
        System.out.println("DependTest.testA");
        //testA将会抛出异常，testB不会被执行
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"testA"})
    public void testB(){
        System.out.println("DependTest.testB");
    }

}
