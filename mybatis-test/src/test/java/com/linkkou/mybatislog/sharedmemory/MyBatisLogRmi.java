package com.linkkou.mybatislog.sharedmemory;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyBatisLogRmi extends Remote {

    String log(String name) throws RemoteException;

}