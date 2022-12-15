
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        for (String task : this.todoList) {
            System.out.println(
                    (this.todoList.indexOf(task) + 1)
                    + ": " + task);
        }
    }

    public void remove(int number) {
        this.todoList.remove(number - 1);
    }

}
