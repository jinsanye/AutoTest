package com.asiainfo.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {


    public void stu1(){
        System.out.println("GroupsOnClass1.stu1运行了");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1.stu2运行了");
    }
}
