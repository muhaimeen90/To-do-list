package todolist;

import java.time.LocalDate;

public class Task {
	private String name;
	private LocalDate dueDate;
	private String priority;
	private boolean completed;

	public Task(String name, String dueDate, String priority) {
		this.name = name;
		this.dueDate = LocalDate.parse(dueDate);
		this.priority = priority;
		this.completed = false;
	}

	public void markCompleted() {
		this.completed = true;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public String getPriority() {
		return priority;
	}

	public boolean isCompleted() {
		return completed;
	}

}
