package org.java.di07;

import java.util.HashMap;
import java.util.Iterator;

public class StudentInfo {

	private HashMap<String, Student> studentMap;
	
	public StudentInfo() {}
	
	public StudentInfo(HashMap<String, Student> studentMap) {
		super();
		this.studentMap = studentMap;
	}

	public void setStudentMap(HashMap<String, Student> studentMap) {
		this.studentMap = studentMap;
	}
	
	public void disp() {
		Iterator<String> iterator= studentMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			
			Student student = studentMap.get(key);
			System.out.println("key:"+key+"  "+student.toString());
			
		}
		
	}
	
	
}
