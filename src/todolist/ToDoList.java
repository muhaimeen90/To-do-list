package todolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToDoList {
	we are the champions 
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

	public void sortByDueDate() {
		Collections.sort(tasks, (t1, t2) -> t1.getDueDate().compareTo(t2.getDueDate()));
	}

	public void sortByPriority() {
		Collections.sort(tasks, (t1, t2) -> t1.getPriority().compareTo(t2.getPriority()));
	}

}
