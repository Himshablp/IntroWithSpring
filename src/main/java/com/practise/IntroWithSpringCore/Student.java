package com.practise.IntroWithSpringCore;

import java.util.Map;
import java.util.Set;

public class Student {
	private int studentId;
	private String studentName;
	private Faculty faculty;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	

	public Faculty getFaculty() {
		return faculty;
	}



	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public void init() {
		System.out.println("This is the init block of Student bean Implemented by XML init-method");
	}
	
	public void destroy() {
		System.out.println("This is the destroy block of bean of student Implemnted by XML destroy-mentod");
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", faculty=" + faculty + "]";
	}



	
	

}
