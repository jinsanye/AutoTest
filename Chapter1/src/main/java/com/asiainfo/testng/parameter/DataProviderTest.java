package com.asiainfo.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name=" + name + "\tage=" + age);
    }

    //根据参数传递值
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o;
        o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }

    @Test(dataProvider = "method")
    public void test1(String name,int age){
        System.out.println("方法test1中的name=" + name + "\tage=" + age);
    }

    @Test(dataProvider = "method")
    public void test2(String name,int age){
        System.out.println("方法test2中的name=" + name + "\tage=" + age);
    }

    //根据方法名传递不同的参数值
    @DataProvider(name = "method")
    public Object[][] methodeProvider(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25}
            };
        }else {
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }
        return result;
    }

}
