package com;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args){
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-server.xml");
//		context.start();
//		try {
//			// 阻塞进程
//			System.in.read();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// main方法启动
		com.alibaba.dubbo.container.Main.main(new String[]{"spring"});
	}
}
