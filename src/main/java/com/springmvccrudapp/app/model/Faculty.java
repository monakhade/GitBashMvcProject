package com.springmvccrudapp.app.model;

public class Faculty 
{
	private int faculty;
	private String facultyname;
	private String occcupation;
	private float salary;
	private long contactnumber;
	public int getFaculty() {
		return faculty;
	}
	public void setFaculty(int faculty) {
		this.faculty = faculty;
	}
	public String getFacultyname() {
		return facultyname;
	}
	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
	public String getOcccupation() {
		return occcupation;
	}
	public void setOcccupation(String occcupation) {
		this.occcupation = occcupation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	
}
