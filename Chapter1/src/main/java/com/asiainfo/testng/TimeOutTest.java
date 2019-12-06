package com.asiainfo.testng;

import org.testng.annotations.Test;


public class TimeOutTest {

    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Thread sleep 2 seconds");
    }

    @Test(timeOut = 2000)
    //中断异常
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Thread sleep 3 seconds");
    }

}
