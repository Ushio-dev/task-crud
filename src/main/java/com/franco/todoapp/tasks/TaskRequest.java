package com.franco.todoapp.tasks;

public class TaskRequest {
	
	private String name;
	private String description;
	
	public TaskRequest() {
		super();
	}

	public TaskRequest(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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
