package com.asiainfo.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu3(){
        System.out.println("GroupsOnClass2.stu3");
    }

    public void stu4(){
        System.out.println("GroupsOnClass2.stu4");
    }
}
