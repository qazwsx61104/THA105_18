package com.core.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@WebListener // 註冊Listener監聽器: 見Servlet講義 p277 或 p364
public class MyListener implements ServletContextListener { // ServletContextListener 是 Servlet Context 生命週期改變時的監聽器介面
    @Override
    public void contextInitialized(ServletContextEvent event) {
    	//當 context 啟動時，此方法會被自動啟動
    	System.out.println("1111111111111111111> ServletContextListener通知:  contextInitialized()方法自動啟動");
    }
    @Override
    public void contextDestroyed(ServletContextEvent event) {
    	// 當 context 關閉時，此方法會被自動啟動
    	System.out.println("2222222222222222222> ServletContextListener通知:  contextDestroyed()方法自動啟動");
    }
}
