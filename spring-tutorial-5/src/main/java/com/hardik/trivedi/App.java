package com.hardik.trivedi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String args[]) {
		//Fetching file from project directory
		//ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/com/hardik/trivedi/beans/beans-config.xml");
		
		//Fetching file from any folder in classpath
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/hardik/trivedi/beans/beans-config.xml");
		
		Person person = (Person)context.getBean("person");
		person.speak();
//		((FileSystemXmlApplicationContext)context).close();
		
		((ClassPathXmlApplicationContext)context).close();
		
		
		System.out.println(person);
	}
}
