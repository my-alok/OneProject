package com.alok.assignment.One.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alok.assignment.One.models.Instructor;
import com.alok.assignment.One.repositories.InstructorRepository;

@Service
public class InstructorService {
	
	@Autowired
	InstructorRepository instructorRepository;
	
	public Instructor addInstructor (Instructor instructor) {
		return instructorRepository.save(instructor);
	}
	
	public Instructor updateInstructor(Instructor instructor) {
		return instructorRepository.save(instructor);
	}
	public void deleteInstructor(int id) {
		instructorRepository.deleteById(id);
	}
	public Iterable<Instructor> findAllInstructors() {
		return instructorRepository.findAll();
	}
	
	public Optional<Instructor> findInstructorById(int id) {
		return instructorRepository.findById(id);
	}

}
