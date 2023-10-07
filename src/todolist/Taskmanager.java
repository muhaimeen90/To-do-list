package todolist;

public class Taskmanager {

	private ToDoList todoList;

	public Taskmanager() {
	        setTodoList(new ToDoList());
	    }

	public void suggestTask() {
		// Add your task suggestion algorithm here
	}

	public void saveToFile(String filename) {
		// Implement code to save the To-Do list to a file
	}

	public void loadFromFile(String filename) {
		// Implement code to load the To-Do list from a file
	}

	public ToDoList getTodoList() {
		return todoList;
	}

	public void setTodoList(ToDoList todoList) {
		this.todoList = todoList;
	}

}
