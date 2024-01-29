package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tset2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean2.xml");
		
		Student2 st1= (Student2) ctx.getBean("ss1");
		
		System.out.println(st1);

	}

}
