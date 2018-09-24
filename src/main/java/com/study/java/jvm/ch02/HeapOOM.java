/*
 * Copyright (c) 2017 xiaoniu, Inc. All rights reserved.
 *
 * @author chunlin.li
 *
 */
package com.study.java.jvm.ch02;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述: 堆内存溢出异常测试
 * <p/>
 * 创建人: Moker
 * <p/>
 * 创建时间: 2018/09/23.
 * <p/>
 * Copyright (c) 凌霄阁-版权所有
 */
public class HeapOOM {

    /**
     * VM Args: -Xms20m -Xmx20m -XX:HeapDumpOnOutOfMemoryError
     */

    static class OOMObject {}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while(true) {
            list.add(new OOMObject());
        }
    }

}