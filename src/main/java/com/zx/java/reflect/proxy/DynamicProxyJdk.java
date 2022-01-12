package com.zx.java.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangxiong
 * @version 2022/1/12 15:19
 */
public class DynamicProxyJdk {

    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName());

                if ("aa".endsWith(method.getName())){
                    System.out.println("执行aa方法");
                }

                return "我是返回结果";
            }
        };

        InterfaceForTest interfaceForTest = (InterfaceForTest) Proxy.newProxyInstance(
                InterfaceForTest.class.getClassLoader(),
                new Class[]{InterfaceForTest.class},
                handler);

        System.out.println(interfaceForTest.aa());
    }

    public interface InterfaceForTest{
        String aa();
    }

}
