package com.restAPI.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restAPI.binding.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable>{
	
	
}
