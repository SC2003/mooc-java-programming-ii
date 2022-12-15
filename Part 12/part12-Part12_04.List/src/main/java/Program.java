
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<String> myList = new List<>();
        System.out.println(myList.size());
        for (int i = 0; i < 2000; i++) {
            myList.add("hello " + i + " times");
        }
        System.out.println(myList.size());
        
        for (int i = 0; i < 2000; i++) {
            System.out.println(myList.value(i));
        }
    }

}
