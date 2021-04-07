package com.alok.assignment.One.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alok.assignment.One.models.Course;
import com.alok.assignment.One.repositories.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	public Course addCourse (Course course) {
		return courseRepository.save(course);
	}
	
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}
	public void deleteCourse(int id) {
		courseRepository.deleteById(id);
	}
	public Iterable<Course> findAllCourses() {
		return courseRepository.findAll();
	}
	
	public Optional<Course> findCourseById(int id) {
		return courseRepository.findById(id);
	}

}
