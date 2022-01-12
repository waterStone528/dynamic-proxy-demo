package com.zx.reflect.proxy;

import com.zx.java.reflect.proxy.CglibMethodInterceptor;
import com.zx.java.reflect.proxy.base.BaseClass;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @author zhangxiong
 * @version 2022/1/12 16:28
 */
public class TestDynamicProxyCglib {
    @Test
    public void test(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(BaseClass.class);
        enhancer.setCallback(new CglibMethodInterceptor());
        BaseClass baseClass = (BaseClass) enhancer.create();
        System.out.println(baseClass.call());
     }
}
