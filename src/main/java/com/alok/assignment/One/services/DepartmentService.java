package com.alok.assignment.One.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alok.assignment.One.models.Department;
import com.alok.assignment.One.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	public Department addDepartment (Department department) {
		return departmentRepository.save(department);
	}
	
	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}
	public void deleteDepartment(String id) {
		departmentRepository.deleteById(id);
	}
	public Iterable<Department> findAllDepartments() {
		return departmentRepository.findAll();
	}
	
	public Optional<Department> findDepartmentById(String id) {
		return departmentRepository.findById(id);
	}

}
