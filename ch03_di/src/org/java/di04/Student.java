package org.java.di04;

public class Student {
	private String name; 
	private String age;
	private String gradeName;
	private String className;
	
	public Student() {}
	public Student(String name, String age, String gradeName, String className) {
		this.name = name;
		this.age = age;
		this.gradeName = gradeName;
		this.className = className;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gradeName=" + gradeName + ", className=" + className + "]";
	}
	
	
	
}
