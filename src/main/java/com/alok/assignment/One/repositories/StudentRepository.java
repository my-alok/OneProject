package com.alok.assignment.One.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alok.assignment.One.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
