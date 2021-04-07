package com.alok.assignment.One.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
	@Id
	@GeneratedValue( strategy=GenerationType.SEQUENCE )
	private int id;
	@OneToOne
	@JoinColumn(name = "DepartmentName")
	private Department department;
	@OneToOne
	@JoinColumn(name = "InstructorId")
	private Instructor instructor;
	@Column(name = "Duration")
	private int duration;
	@Column(name = "Name")
	private String name;
}
