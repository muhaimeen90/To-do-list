package todolist;

import java.util.Scanner;

public class Myman {
	public static void main(String[] args) {
		Taskmanager taskManager = new Taskmanager();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nTo-Do List Manager");
			System.out.println("1. Add Task");
			System.out.println("2. Mark Task as Completed");
			System.out.println("3. Remove Task");
			System.out.println("4. List Tasks");
			System.out.println("5. Sort by Due Date");
			System.out.println("6. Sort by Priority");
			System.out.println("7. Suggest Task");
			System.out.println("8. Save To-Do List");
			System.out.println("9. Load To-Do List");
			System.out.println("0. Quit");

			System.out.print("Enter your choice: ");
			String choice = scanner.nextLine();

			switch (choice) {
			case "1":
				System.out.print("Enter task name: ");
				String name = scanner.nextLine();
				System.out.print("Enter due date (yyyy-mm-dd): ");
				String dueDate = scanner.nextLine();
				System.out.print("Enter priority (High/Medium/Low): ");
				String priority = scanner.nextLine();
				Task task = new Task(name, dueDate, priority);
				taskManager.getTodoList().addTask(task);
				break;

			case "2":
				// Implement marking a task as completed
				break;

			case "3":
				// Implement removing a task
				break;

			case "4":
				taskManager.getTodoList().listTasks();
				break;

			case "5":
				taskManager.getTodoList().sortByDueDate();
				break;

			case "6":
				taskManager.getTodoList().sortByPriority();
				break;

			case "7":
				taskManager.suggestTask();
				break;

			case "8":
				System.out.print("Enter filename to save: ");
				String saveFilename = scanner.nextLine();
				taskManager.saveToFile(saveFilename);
				break;

			case "9":
				System.out.print("Enter filename to load: ");
				String loadFilename = scanner.nextLine();
				taskManager.loadFromFile(loadFilename);
				break;

			case "0":
				System.out.println("Goodbye!");
				scanner.close();
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}
	}

}
