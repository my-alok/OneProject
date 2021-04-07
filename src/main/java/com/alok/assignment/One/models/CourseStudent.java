package com.alok.assignment.One.models;

import javax.persistence.CascadeType;
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
@Entity(name = "Course_Student")
public class CourseStudent {
	@Id
	@GeneratedValue( strategy=GenerationType.SEQUENCE )
	private int id;
	@ManyToOne(cascade = CascadeType.MERGE)
	private Course course;
	@ManyToOne(cascade = CascadeType.MERGE)
	private Student student;
}
