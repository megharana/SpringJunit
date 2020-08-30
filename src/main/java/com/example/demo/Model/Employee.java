package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
	
	@JsonProperty("employee_name")
	private String name;
	@JsonProperty("employee_salary")
	private String salary;
	@JsonProperty("employee_age")
	private String age;
	@JsonProperty("id")
	private String employeeID;
	@JsonProperty("profile_image")
	private String profileImg;
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	

}
