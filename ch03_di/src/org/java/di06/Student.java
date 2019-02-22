package org.java.di06;

public class Student {
	private String name;
	private String age;
	private String gradeName;
	private String className;

	public Student() {
	}

	public Student(String name, String age, String gradeName, String className) {
		this.name = name;
		this.age = age;
		this.gradeName = gradeName;
		this.className = className;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gradeName=" + gradeName + ", className=" + className + "]";
	}

}
