
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employeeList;

    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employeeList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> this.employeeList.add(person));
    }

    public void print() {
        this.employeeList.stream().forEach(System.out::println);
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employeeList.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (education.equals(nextInLine.getEducation())) {
                System.out.println(nextInLine);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employeeList.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (education.equals(nextInLine.getEducation())) {
                iterator.remove();
            }
        }
    }
}
