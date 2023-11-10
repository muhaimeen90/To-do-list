package todolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ToDoList {
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	private List<Task> tasks;

	public ToDoList() {
		tasks = new ArrayList<>();
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void removeTask(Task task) {
		tasks.remove(task);
	}

	public void listTasks() {
		for (Task task : tasks) {
			String status = task.isCompleted() ? "Completed" : "Pending";
			System.out.println(task.getName() + " (Due: " + task.getDueDate() + ", Priority: " + task.getPriority()
					+ ", Status: " + status + ")");
		}
	}
	public void removeTaskByName(String taskName) {
		Task taskToRemove = findTaskByName(taskName);
		if (taskToRemove != null) {
			removeTask(taskToRemove);
			System.out.println("Task removed: " + taskToRemove.getName());
		} else {
			System.out.println("Task not found.");
		}
	}

	public void markTaskAsCompletedByName(String taskName) {
		Task taskToMarkCompleted = findTaskByName(taskName);
		if (taskToMarkCompleted != null) {
			taskToMarkCompleted.markCompleted();
			System.out.println("Task marked as completed: " + taskToMarkCompleted.getName());
		} else {
			System.out.println("Task not found.");
		}
	}

	private Task findTaskByName(String taskName) {
		return tasks.stream()
				.filter(task -> task.getName().equalsIgnoreCase(taskName))
				.findFirst()
				.orElse(null);
	}
	public List<Task> getSuggestedTasks() {
		List<Task> uncompletedTasks = tasks.stream()
				.filter(task -> !task.isCompleted())
				.collect(Collectors.toList());

		uncompletedTasks.sort(Comparator
				.comparing(Task::getPriority)
				.thenComparing(Task::getDueDate));

		return uncompletedTasks;
	}

	public void sortByDueDate() {
		Collections.sort(tasks, (t1, t2) -> t1.getDueDate().compareTo(t2.getDueDate()));
	}

	public void sortByPriority() {
		Collections.sort(tasks, (t1, t2) -> t1.getPriority().compareTo(t2.getPriority()));
	}

}
