//No idea why is this here!!!!
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<Integer> input = new ArrayList<>();

        while (true) {
            String read = scanner.nextLine();

            if (read.equals("end")) {
                break;
            }

            input.add(Integer.valueOf(read));
        }

        System.out.println("");

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choise = scanner.nextLine();
        if (choise.equals("n")) {
            System.out.println("Average of the negative numbers: " + input.stream().filter(l -> l < 0).mapToInt(i -> i).average().getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: " + input.stream().filter(l -> l > 0).mapToInt(i -> i).average().getAsDouble());
        }

    }
}
