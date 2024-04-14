package com.restAPI.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restAPI.binding.Student;
import com.restAPI.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> l1 = studentService.getAllStudents(); 
		return new ResponseEntity<>(l1, HttpStatus.OK);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getById(@PathVariable Integer id){
		Student statuString = studentService.getById(id);
		return new ResponseEntity<>(statuString,HttpStatus.OK);
	}
	
	@PostMapping("/student")
	public ResponseEntity<String> createStudent(@RequestBody Student student){
		String s = studentService.upsert(student);
		return new ResponseEntity<>(s,HttpStatus.CREATED);
	}
	
	@PutMapping("/student")
	public ResponseEntity<String> updateStudent(@RequestBody Student student){
		String s = studentService.upsert(student);
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
		String status = studentService.deleteById(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
