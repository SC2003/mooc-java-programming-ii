
import java.util.Random;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int amountOfNums = Integer.valueOf(scanner.nextLine());
        printRandomNums(amountOfNums);
    }
    
    public static void printRandomNums(int num) {
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            int randomNumber = rand.nextInt(11);
            System.out.println(randomNumber);
        }
        
    }
}
