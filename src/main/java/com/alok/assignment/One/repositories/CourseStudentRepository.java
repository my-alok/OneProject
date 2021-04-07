package com.alok.assignment.One.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.alok.assignment.One.models.CourseStudent;

public interface CourseStudentRepository extends CrudRepository<CourseStudent, Integer> {
	@Query(value = "select * from course  where id in (select course_id from course_student where student_id = :studentId)", nativeQuery = true)
	List<Object[]>findAllCoursesByStudentId(int studentId);
}
