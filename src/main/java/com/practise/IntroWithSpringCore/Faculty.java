package com.practise.IntroWithSpringCore;

public class Faculty {
	private String fecName;
	private String fecCollege;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFecName() {
		return fecName;
	}
	public void setFecName(String fecName) {
		this.fecName = fecName;
	}
	public String getFecCollege() {
		return fecCollege;
	}
	public void setFecCollege(String fecCollege) {
		this.fecCollege = fecCollege;
	}
	@Override
	public String toString() {
		return "Faculty [fecName=" + fecName + ", fecCollege=" + fecCollege + "]";
	}
	
	

}
