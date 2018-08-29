package com.exilant.demo.model;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="eid")
	private int eid;
	
	 
	@Column(name="name")
	private String name;
	

	@Column(name="age")
	private int age;
	
	@Column
	private long phone;
	
	@Column
	private String gender;
	
	@Column
	private String designation;
	
	@Column
	private String username;

	@Column
	private String password;
	
	public Employee() {}
	
	public Employee(String name, int age, long phone, String gender, String designation, String username,
			String password) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.gender = gender;
		this.designation = designation;
		this.username = username;
		this.password = password;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
