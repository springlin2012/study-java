/*
 * Copyright (c) 2017 xiaoniu, Inc. All rights reserved.
 *
 * @author chunlin.li
 *
 */
package com.study.java.desingmode.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 功能描述: 远程代理
 * <p/>
 * 创建人: chunlin.li
 * <p/>
 * 创建时间: 2018/10/16.
 * <p/>
 * Copyright (c) 深圳市牛鼎丰科技有限公司-版权所有
 */
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;

}
