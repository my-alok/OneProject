package com.alok.assignment.One.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alok.assignment.One.models.Student;
import com.alok.assignment.One.services.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	@Autowired
	private StudentService studentService;
	Logger logger = LoggerFactory.getLogger(StudentController.class);

	@PutMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.addStudent(student), HttpStatus.CREATED);
	}
	@PostMapping("/students")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.updateStudent(student), HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
		return new ResponseEntity<Student>(HttpStatus.OK);
	}

	@GetMapping("/students")
	public ResponseEntity<List<Student>> findAllStudents() {
		return new ResponseEntity(studentService.findAllStudents(), HttpStatus.OK);
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable int id) {
		return new ResponseEntity<Optional<Student>>(studentService.findStudentById(id), HttpStatus.OK);
	}
}
