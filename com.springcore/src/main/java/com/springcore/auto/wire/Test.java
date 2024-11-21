package com.springcore.auto.wire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Emp e1 = (Emp) ctx.getBean("emp1");
		System.out.println(e1);
	}
}
