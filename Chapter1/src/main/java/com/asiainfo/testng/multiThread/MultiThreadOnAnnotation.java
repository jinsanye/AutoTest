package com.asiainfo.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotation {

    @Test(invocationCount = 6,threadPoolSize = 3)
    public void test(){
        System.out.println("111111");
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

}
