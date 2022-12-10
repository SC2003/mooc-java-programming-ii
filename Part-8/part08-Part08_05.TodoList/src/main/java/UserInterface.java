
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = input();

            switch (command.toLowerCase()) {
                case "stop":
                    return;
                case "add":
                    addTasks();
                    break;
                case "list":
                    listTasks();
                    break;
                case "remove":
                    removeTasks();
                    break;
            }
        }
    }

    public String input() {
        String word = this.scanner.nextLine();
        return word;
    }

    private void addTasks() {
        System.out.println("To add:");
        String task = input();
        this.todoList.add(task);
    }

    private void listTasks() {
        this.todoList.print();
    }

    private void removeTasks() {
        System.out.println("Which one is removed?");
        int id = Integer.valueOf(input());
        this.todoList.remove(id);
    }

}
