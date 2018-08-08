/*
 * Copyright (c) 2017 xiaoniu, Inc. All rights reserved.
 *
 * @author chunlin.li
 *
 */
package com.study.java.reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 功能描述: XXXX
 * <p/>
 * 创建人: chunlin.li
 * <p/>
 * 创建时间: 2018/08/08.
 * <p/>
 * Copyright (c) 深圳市牛鼎丰科技有限公司-版权所有
 */
public class TestReflectionLog {

    public static void main(String[] args) {
        try {
            TestLog obj = TestLog.class.newInstance();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();

            Method m = TestLog.class.getDeclaredMethod(s, String.class, String.class);
            String a = br.readLine();
            String b = br.readLine();

            System.out.println("Test."+ m.getName() +"has been called with "+ a +","+ b);
            System.out.println(m.invoke(obj, a, b));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}

class TestLog {
    public int add(String a, String b) {
        return Integer.valueOf(a)+Integer.valueOf(b);
    }
}
