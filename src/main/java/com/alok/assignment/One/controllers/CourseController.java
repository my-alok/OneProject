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

import com.alok.assignment.One.models.Course;
import com.alok.assignment.One.services.CourseService;

@RestController
@RequestMapping("/api/v1")
public class CourseController {
	@Autowired
	private CourseService courseService;
	Logger logger = LoggerFactory.getLogger(CourseController.class);

	@PutMapping("/courses")
	public ResponseEntity<Course> addCourse(@RequestBody Course course) {
		return new ResponseEntity<Course>(courseService.addCourse(course), HttpStatus.CREATED);
	}
	@PostMapping("/courses")
	public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
		return new ResponseEntity<Course>(courseService.updateCourse(course), HttpStatus.OK);
	}
	
	@DeleteMapping("/courses/{id}")
	public ResponseEntity<Course> deleteCourse(@PathVariable int id) {
		courseService.deleteCourse(id);
		return new ResponseEntity<Course>(HttpStatus.OK);
	}

	@GetMapping("/courses")
	public ResponseEntity<List<Course>> findAllCourses() {
		return new ResponseEntity(courseService.findAllCourses(), HttpStatus.OK);
	}
	
	@GetMapping("/courses/{id}")
	public ResponseEntity<?> getCourseById(@PathVariable int id) {
		return new ResponseEntity<Optional<Course>>(courseService.findCourseById(id), HttpStatus.OK);
	}
}
