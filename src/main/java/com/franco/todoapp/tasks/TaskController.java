package com.franco.todoapp.tasks;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TaskController {
	private final TaskRepository repository;
	
	public TaskController(TaskRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public List<Task> findAllTasks() {
		return repository.findAll();
	}
	
	@PostMapping("/nuevo")
	public Task saveTask(@RequestBody TaskRequest taskRequest) {
		Task newTask = new Task(taskRequest.getName(), taskRequest.getDescription());
		return repository.save(newTask);
	}
}
