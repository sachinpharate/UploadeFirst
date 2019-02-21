package com.sachin.SpringMVCBoot;

import org.springframework.stereotype.Component;

@Component

public class Alion {

	private int age;
	private String Name;

	public Alion() {
		super();
		System.out.println("In Alion constructor....");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
