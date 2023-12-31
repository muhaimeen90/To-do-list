package todolist;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Taskmanager {

	private ToDoList todoList;

	public Taskmanager() {
	        setTodoList(new ToDoList());
	    }

	public void suggestTask() {
		List<Task> suggestedTasks = todoList.getSuggestedTasks();
		if (!suggestedTasks.isEmpty()) {
			Task suggestedTask = suggestedTasks.get(0);
			System.out.println("Suggested task: " + suggestedTask.getName());
		} else {
			System.out.println("No tasks available for suggestion.");
		}	}

	public void saveToFile(String filename) {
		File myfile = new File(filename);
		if(!myfile.exists()) {
			try {
				myfile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Can't create file! ");
			}
		}
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filename);
			for(Task x : todoList.getTasks()) {
				fileWriter.write(x.getName()+" "+x.getDueDate()+" "+x.getPriority());
			}
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public void loadFromFile(String filename) {
		File myfile = new File(filename);
		if(!myfile.exists()) {
			System.out.println("File doesnt exist!");
		}
		else {
			Scanner sc = null;
			try {
				sc = new Scanner(myfile);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			while(sc.hasNextLine()){
				String line= sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}
	}

	public ToDoList getTodoList() {
		return todoList;
	}

	public void setTodoList(ToDoList todoList) {
		this.todoList = todoList;
	}

}
