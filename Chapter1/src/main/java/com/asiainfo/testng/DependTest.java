package com.asiainfo.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void testA(){
        System.out.println("DependTest.testA");
    }

    @Test(dependsOnMethods = {"testA"})
    public void testB(){
        System.out.println("DependTest.testB");
    }

}
