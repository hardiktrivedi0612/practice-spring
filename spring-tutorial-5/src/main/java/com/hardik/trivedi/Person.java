package com.hardik.trivedi;

public class Person {
	
	private int id;
	private String name;
	
	private String taxId;
	
	public Person() {
		super();
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
	}

	public void speak() {
		System.out.println("Hello! I'm a person.");
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
}
