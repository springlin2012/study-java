/*
 * Copyright (c) 2017 xiaoniu, Inc. All rights reserved.
 *
 * @author chunlin.li
 *
 */
package com.study.java.jvm.ch02;

/**
 * 功能描述: 虚拟机栈和本地方法栈测试
 * <p/>
 * 创建人: Moker
 * <p/>
 * 创建时间: 2018/09/24.
 * <p/>
 * Copyright (c) 凌霄阁-版权所有
 */
public class JavaVMStackSOF {

    /**
     * VM Args: -Xss128k
     */

    private int stackLenth = 1;

    public void stackLeak() {
        stackLenth++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:"+ oom.stackLenth);
            throw e;
        }
    }
}