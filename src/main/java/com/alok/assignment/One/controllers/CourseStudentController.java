package com.alok.assignment.One.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alok.assignment.One.models.Course;
import com.alok.assignment.One.models.CourseStudent;
import com.alok.assignment.One.services.CourseStudentService;

@RestController
@RequestMapping("/api/v1")
public class CourseStudentController {

	@Autowired
	private CourseStudentService courseStudentService;
	
	@PutMapping("/subscribecourse")
	public ResponseEntity<?> subscribeCourse(@RequestBody CourseStudent courseStudent) {
		courseStudentService.subscribeCourse(courseStudent);
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/unsubscribecourse")
	public ResponseEntity<?> unSubscribeCourse(@RequestBody CourseStudent courseStudent) {
		courseStudentService.unSubscribeCourse(courseStudent);
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/courseslist/{studentId}")
	public ResponseEntity<List<Course>> cousesListByStudentId(@PathVariable int studentId) {
		return new ResponseEntity<List<Course>>(courseStudentService.coursesListByStudentId(studentId), HttpStatus.ACCEPTED);
	}
}
