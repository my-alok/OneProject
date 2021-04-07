package com.alok.assignment.One.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alok.assignment.One.models.Course;
import com.alok.assignment.One.models.CourseStudent;
import com.alok.assignment.One.models.Department;
import com.alok.assignment.One.repositories.CourseStudentRepository;

@Service
public class CourseStudentService {
	@Autowired
	private CourseStudentRepository courseStudentRepository;

	public void subscribeCourse(CourseStudent courseStudent) {
		courseStudentRepository.save(courseStudent);
	}
	
	public void unSubscribeCourse(CourseStudent courseStudent) {
		courseStudentRepository.delete(courseStudent);
	}
	
	public List<Course> coursesListByStudentId(int studentId) {
		/*
		 * List<Object[]> resultSet =
		 * courseStudentRepository.findAllCoursesByStudentId(studentId); List<Course>
		 * courses = new ArrayList<>(); for(Object[] obj : resultSet) { Course course =
		 * new Course(); course.setId((int)obj[0]); course.setDepartment(new
		 * Department()).setName((String) obj[3]); course.getInstructor().setId((int)
		 * obj[4]); course.setDuration((int) obj[1]); course.setName((String) obj[2]);
		 * courses.add(course); } return courses;
		 */
		return new ArrayList<Course>();
	}
	
}
