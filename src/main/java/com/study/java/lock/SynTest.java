/*
 * Copyright (c) 2017 xiaoniu, Inc. All rights reserved.
 *
 * @author chunlin.li
 *
 */
package com.study.java.lock;

import sun.org.mozilla.javascript.internal.json.JsonParser;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 功能描述: XXXX
 * <p/>
 * 创建人: chunlin.li
 * <p/>
 * 创建时间: 2018/10/16.
 * <p/>
 * Copyright (c) 深圳市牛鼎丰科技有限公司-版权所有
 */
public class SynTest {

    public static List<Integer> arry = new ArrayList<Integer>();

    public static void main(final String[] args) throws Exception {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (SynTest.class) {
                    Lock lock = new ReentrantLock();
                    lock.lock();
                    arry.add(Integer.valueOf(1));
                    try {
                        Thread.sleep(2000);
                        System.out.println("T_1 SIZE:"+ arry.size());
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                arry.add(Integer.valueOf(2));
                System.out.println("T_2 SIZE:"+ arry.size());
            }
        }).start();

    }
}
