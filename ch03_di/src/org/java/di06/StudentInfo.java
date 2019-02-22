package org.java.di06;

import java.util.ArrayList;

public class StudentInfo {
	private ArrayList<Student> studentsList;

	public StudentInfo() {
	}

	public StudentInfo(ArrayList<Student> studentsList) {
		this.studentsList = studentsList;
	}

	public void setStudentsList(ArrayList<Student> studentsList) {
		this.studentsList = studentsList;
	}
	
	public void disp() {
		for(int i=0;i<studentsList.size();i++) {
			Student student = studentsList.get(i);
			System.out.println(student.toString());
		}
	}
}
