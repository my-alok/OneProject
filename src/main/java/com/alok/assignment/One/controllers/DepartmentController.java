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

import com.alok.assignment.One.models.Department;
import com.alok.assignment.One.services.DepartmentService;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	Logger logger = LoggerFactory.getLogger(DepartmentController.class);

	@PutMapping("/departments")
	public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
		return new ResponseEntity<Department>(departmentService.addDepartment(department), HttpStatus.CREATED);
	}
	@PostMapping("/departments")
	public ResponseEntity<Department> updateDepartment(@RequestBody Department department) {
		return new ResponseEntity<Department>(departmentService.updateDepartment(department), HttpStatus.OK);
	}
	
	@DeleteMapping("/departments/{id}")
	public ResponseEntity<Department> deleteDepartment(@PathVariable String id) {
		departmentService.deleteDepartment(id);
		return new ResponseEntity<Department>(HttpStatus.OK);
	}

	@GetMapping("/departments")
	public ResponseEntity<List<Department>> findAllDepartments() {
		return new ResponseEntity(departmentService.findAllDepartments(), HttpStatus.OK);
	}
	
	@GetMapping("/departments/{id}")
	public ResponseEntity<?> getDepartmentById(@PathVariable String id) {
		return new ResponseEntity<Optional<Department>>(departmentService.findDepartmentById(id), HttpStatus.OK);
	}
}
