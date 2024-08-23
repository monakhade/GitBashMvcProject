package com.springmvccrudapp.app.model;

public class Course 
{
	private int courseid;
	private String coursename;
	private String coursetype;
	private float coursefees;
	private String availablemodel;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursetype() {
		return coursetype;
	}
	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}
	public float getCoursefees() {
		return coursefees;
	}
	public void setCoursefees(float coursefees) {
		this.coursefees = coursefees;
	}
	public String getAvailablemodel() {
		return availablemodel;
	}
	public void setAvailablemodel(String availablemodel) {
		this.availablemodel = availablemodel;
	}
	
}
