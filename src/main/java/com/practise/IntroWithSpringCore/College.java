package com.practise.IntroWithSpringCore;

public class College {
	String collegeCode;
	String collegeName;
	
	public String getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "College [collegeCode=" + collegeCode + ", collegeName=" + collegeName + "]";
	}
	

}
