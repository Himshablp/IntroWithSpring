package com.practise.IntroWithSpringCore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Student {
	@Value("10")
	String studentId;
	@Value("RKGIT Student")
	String studentName;
	@Value("RKGIT")
	String studentCollege;
	@Value("#{list}")
	List<String> address;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCollege() {
		return studentCollege;
	}
	public void setStudentCollege(String studentCollege) {
		this.studentCollege = studentCollege;
	}
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCollege=" + studentCollege
				+ ", address=" + address + "]";
	}
	
	

}
