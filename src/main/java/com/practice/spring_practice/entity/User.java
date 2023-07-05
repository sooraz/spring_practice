package com.practice.spring_practice.entity;



//@Entity
public class User {

@Override
	public String toString() {
		return "User [name=" + name + ", rollNo=" + rollNo + ", standard=" + standard + "]";
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
	private String name;
	private String rollNo;
	private int standard;
}
