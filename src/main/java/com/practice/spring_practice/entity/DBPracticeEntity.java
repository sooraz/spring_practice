package com.practice.spring_practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "practice1")
@Data
public class DBPracticeEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Mane")
	private String name;
	@Column(name = "Rollno")
	private String rollno;
	@Column
	private int number;
//	public int getId() {
//		return this.id;
//	}
	
}
