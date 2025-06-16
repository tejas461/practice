package com.demo.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.practice.entity.Student;

public interface studentRepository  extends JpaRepository<Student, Integer>{

}
