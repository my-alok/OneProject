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

import com.alok.assignment.One.models.Instructor;
import com.alok.assignment.One.services.InstructorService;

@RestController
@RequestMapping("/api/v1")
public class InstructorController {
	@Autowired
	private InstructorService instructorService;
	Logger logger = LoggerFactory.getLogger(InstructorController.class);

	@PutMapping("/instructors")
	public ResponseEntity<Instructor> addInstructor(@RequestBody Instructor instructor) {
		return new ResponseEntity<Instructor>(instructorService.addInstructor(instructor), HttpStatus.CREATED);
	}
	@PostMapping("/instructors")
	public ResponseEntity<Instructor> updateInstructor(@RequestBody Instructor instructor) {
		return new ResponseEntity<Instructor>(instructorService.updateInstructor(instructor), HttpStatus.OK);
	}
	
	@DeleteMapping("/instructors/{id}")
	public ResponseEntity<Instructor> deleteInstructor(@PathVariable int id) {
		instructorService.deleteInstructor(id);
		return new ResponseEntity<Instructor>(HttpStatus.OK);
	}

	@GetMapping("/instructors")
	public ResponseEntity<List<Instructor>> findAllInstructors() {
		return new ResponseEntity(instructorService.findAllInstructors(), HttpStatus.OK);
	}
	
	@GetMapping("/instructors/{id}")
	public ResponseEntity<?> getInstructorById(@PathVariable int id) {
		return new ResponseEntity<Optional<Instructor>>(instructorService.findInstructorById(id), HttpStatus.OK);
	}
}
