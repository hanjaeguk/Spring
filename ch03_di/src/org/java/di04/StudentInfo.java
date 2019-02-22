package org.java.di04;

public class StudentInfo {
	private Student students;

	public StudentInfo() {}
	public StudentInfo(Student students) {
		this.students = students;
	}
	
	public void disp() {
		System.out.println(students.toString());
	}
	
	
}
