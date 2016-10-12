package com.hardik.trivedi;

import org.springframework.context.ApplicationContext;

public class App {
	public static void main(String args[]) {
		ApplicationContext context;
		Person person = new Person();
		person.speak();
	}
}
