package com.asiainfo.testng;

import org.testng.annotations.Test;

public class ExpectedExpception {

    /*
      期望输出结果为异常
     */

    //失败的
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("ExpectedExpception.runTimeExceptionFailed");
    }

    //成功的
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("ExpectedExpception.runTimeExceptionSuccess");
        throw new RuntimeException();
    }

}
