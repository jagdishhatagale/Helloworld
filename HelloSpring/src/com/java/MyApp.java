package com.java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld obj= (HelloWorld) context.getBean("helloWorld");
		System.out.println("The msg after GIT.........333");
		obj.getMessage();

	}

}
