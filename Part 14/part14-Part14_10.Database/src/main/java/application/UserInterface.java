package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;
    private int idCount;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
        this.idCount = 0;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");
            idCount = 0;
            System.out.print("> ");
            String command = input();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            switch (command.toLowerCase()) {
                case "x":
                    return;
                case "1":
                    listTasks();
                    break;
                case "2":
                    addTasks();
                    break;
                case "3":
                    markAsDone();
                    break;
                case "4":
                    removeTasks();
                    break;
            }
        }

        System.out.println("Thank you!");
    }

    public String input() {
        String word = this.scanner.nextLine();
        return word;
    }

    private void listTasks() throws SQLException {
        System.out.println("Listing the database contents");
        if (!this.database.list().isEmpty()) {
            for (Todo todo : this.database.list()) {
                System.out.println(todo);
            }
        }
    }

    private void addTasks() throws SQLException {
        idCount++;
        System.out.println("Adding a new todo");
        System.out.println("Enter name");
        String taskName = input();
        System.out.println("Enter description");
        String taskDescription = input();
        Todo todo = new Todo(idCount, taskName, taskDescription, false);
        this.database.add(todo);
    }

    private void markAsDone() throws SQLException {
        System.out.println("Which todo should be marked as done (give the id)?");
        int taskId = Integer.valueOf(this.scanner.nextLine());
        for (Todo todo : this.database.list()) {
            if (todo.getId() == taskId) {
                this.database.markAsDone(taskId);
                break;
            }
        }
    }

    private void removeTasks() throws SQLException {
        System.out.println("Which todo should be removed (give the id)?");
        int taskId = Integer.valueOf(input());

        for (Todo todo : this.database.list()) {
            if (todo.getId() == taskId) {
                this.database.remove(taskId);
                break;
            }
        }
    }

}
