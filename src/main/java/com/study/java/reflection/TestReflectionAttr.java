/*
 * Copyright (c) 2017 xiaoniu, Inc. All rights reserved.
 *
 * @author chunlin.li
 *
 */
package com.study.java.reflection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

/**
 * 功能描述: 动态加载属性
 * <p/>
 * 创建人: chunlin.li
 * <p/>
 * 创建时间: 2018/08/08.
 * <p/>
 * Copyright (c) 深圳市牛鼎丰科技有限公司-版权所有
 */
public class TestReflectionAttr {

    public static void main(String[] args) {
        try {
            TestAttr obj = TestAttr.class.newInstance();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fieldName = br.readLine();

            Field f = TestAttr.class.getDeclaredField(fieldName);
            f.set(obj, Class.forName("com.study.java.reflection."+ br.readLine()).newInstance());

            obj.out();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class TestAttr {
    public Test test;

    public void out() {
        test.sayHello();
        test.sayWorld();
    }

}
