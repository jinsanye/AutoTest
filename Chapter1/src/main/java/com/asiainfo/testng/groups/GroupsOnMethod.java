package com.asiainfo.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void serverTest1(){
        System.out.println("GroupsOnMethod.serverTest1这是服务端测试方法1111");
    }

    @Test(groups = "server")
    public void serverTest2(){
        System.out.println("GroupsOnMethod.serverTest2这是服务端测试方法2222");
    }

    @Test(groups = "client")
    public void clientTest3(){
        System.out.println("GroupsOnMethod.clientTest1这是客户端测试方法1111");
    }

    @Test(groups = "client")
    public void clientTest4(){
        System.out.println("GroupsOnMethod.clientTest2这是客户端测试方法2222");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("GroupsOnMethod.beforeGroupsOnServer这是服务端组运行前的方法！");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("GroupsOnMethod.afterGroupsOnServer这是服务端组运行后的方法！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("GroupsOnMethod.beforeGroupsOnClient这是客户端组运行前的方法！");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("GroupsOnMethod.beforeGroupsOnClient这是客户端组运行后的方法！");
    }
}
