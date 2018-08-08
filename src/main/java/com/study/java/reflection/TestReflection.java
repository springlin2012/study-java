/*
 * Copyright (c) 2017 xiaoniu, Inc. All rights reserved.
 *
 * @author chunlin.li
 *
 */
package com.study.java.reflection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/**
 * 功能描述: 反射
 * <p/>
 * 创建人: chunlin.li
 * <p/>
 * 创建时间: 2018/08/08.
 * <p/>
 * Copyright (c) 深圳市牛鼎丰科技有限公司-版权所有
 */
public class TestReflection {

    public static void main(String[] args) {
        try {
            Test obj = Test.class.newInstance();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();

            Method m;
            if (s.equals("sayh")) {
                m = Test.class.getDeclaredMethod("sayHello");
            } else {
                m = Test.class.getDeclaredMethod("sayWorld");
            }
            m.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

class Test {
    public void sayHello() {
        System.out.println("hello");
    }

    public void sayWorld() {
        System.out.println("world");
    }
}
