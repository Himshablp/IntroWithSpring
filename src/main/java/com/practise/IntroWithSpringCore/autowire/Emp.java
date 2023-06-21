package com.practise.IntroWithSpringCore.autowire;

public class Emp {
	String empId;
	String empName;
	Address address;
	
	public Emp() {
		super();
		System.out.println("Emp Object Creating by Spring and Store it into Application Context");
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("Emp Object Setting");
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	

}
