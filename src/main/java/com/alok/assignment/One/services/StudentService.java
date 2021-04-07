package com.alok.assignment.One.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alok.assignment.One.models.Student;
import com.alok.assignment.One.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student addStudent (Student student) {
		return studentRepository.save(student);
	}
	
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	public Iterable<Student> findAllStudents() {
		return studentRepository.findAll();
	}
	
	public Optional<Student> findStudentById(int id) {
		return studentRepository.findById(id);
	}

}
