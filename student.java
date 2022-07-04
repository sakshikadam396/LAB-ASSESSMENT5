package com.greatlearning.student.entity;
import javax.persistence.Entity;
import javax.persistence.GenaratedValue;
import javax.persistence.GenarationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@table(name="student")
public class student {
      
	@id
	@GenaratedValue(strategy=GenarationType.IDENTITY)
	private int id;
	private String name;
	private String department;
	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public student() {
	}
	public student(String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student Details: \nName: "+name+"\nDepartment: "+department+"\nCounty: "+country;
	}
	
	
}
