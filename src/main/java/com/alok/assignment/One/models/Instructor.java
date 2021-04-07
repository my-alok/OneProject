package com.alok.assignment.One.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {
	@Id
	@GeneratedValue( strategy=GenerationType.SEQUENCE )
	private int id;
	@OneToOne
	@JoinColumn(name = "Name")
	private Department department;
	@Column(name = "HeadedBy")
	private String headedBy;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "Phone")
	private String phone;
}
