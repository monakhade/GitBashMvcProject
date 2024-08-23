package com.springmvccrudapp.app.model;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Batch 
{
	@Id
	private int batchid;
	private String batchname;
	private int sundentcount;
	private String batchtime;
	@OneToOne
	private Course course;
	@OneToMany
	private Set<Faculty>faculty;
	@OneToMany
	private Set<Student>student;
	public int getBatchid() {
		return batchid;
	}
	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public int getSundentcount() {
		return sundentcount;
	}
	public void setSundentcount(int sundentcount) {
		this.sundentcount = sundentcount;
	}
	public String getBatchtime() {
		return batchtime;
	}
	public void setBatchtime(String batchtime) {
		this.batchtime = batchtime;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Set<Faculty> getFaculty() {
		return faculty;
	}
	public void setFaculty(Set<Faculty> faculty) {
		this.faculty = faculty;
	}
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	
}
