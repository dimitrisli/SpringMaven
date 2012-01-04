package com.dimitrisli.springFirstExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class BeanContainer {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/spring-beans.xml");
		MyBean myBean = (MyBean) context.getBean("myBeanTuple");
		myBean.printMyBean();
	}
}
