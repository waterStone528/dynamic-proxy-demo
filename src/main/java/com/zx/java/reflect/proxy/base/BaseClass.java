package com.zx.java.reflect.proxy.base;

/**
 * @author zhangxiong
 * @version 2022/1/12 17:07
 */
public class BaseClass {
    public String call(){
        System.out.println("call start");
        return "im original call";
    }
}
