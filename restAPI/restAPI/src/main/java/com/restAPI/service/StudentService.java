package com.restAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restAPI.binding.Student;
import com.restAPI.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public String upsert(Student student) {
		studentRepository.save(student);
		return "success";
	}
	
	public String deleteById(Integer id) {
		if(studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
			return "Deleted";
		}
		else {
			return "No record found";
		}
	}
	
	public Student getById(Integer id) {
		Optional<Student> findByIdOptional = studentRepository.findById(id);
		
		if(findByIdOptional.isPresent()) {
			return findByIdOptional.get();
		}
		return null;
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
}
