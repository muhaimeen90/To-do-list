package todolist;

public class Task {
	private String name;
	private String dueDate;
	private String priority;
	private boolean completed;

	public Task(String name, String dueDate, String priority) {
		this.name = name;
		this.dueDate = dueDate;
		this.priority = priority;
		this.completed = false;
	}

	public void markCompleted() {
		this.completed = true;
	}

	public String getName() {
		return name;
	}

	public String getDueDate() {
		return dueDate;
	}

	public String getPriority() {
		return priority;
	}

	public boolean isCompleted() {
		return completed;
	}

}
