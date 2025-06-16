package com.demo.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="student")
public class Student {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="student_percentage")
	private float percentage;
	
	@Column(name="student_branch")
	private String branch;

	
	
}
