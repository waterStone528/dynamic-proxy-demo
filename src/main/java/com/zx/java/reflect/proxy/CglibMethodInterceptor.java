package com.zx.java.reflect.proxy;

import lombok.NoArgsConstructor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangxiong
 * @version 2022/1/12 16:00
 */
public class CglibMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("intercept start");

        Object result = methodProxy.invokeSuper(o, objects);

        System.out.println("intercept end");

        return result;
    }
}

