package com.franco.todoapp.tasks;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "TASKS")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 55)
	private String name;
	
	@Column(length = 155)
	private String description;

	
	public Task() {
		super();
	}


	public Task(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}


	public Task(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
