
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputList = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputList.add(input);

        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String cmd = scanner.nextLine();
        switch (cmd) {
            case "n":

                System.out.println("Average of the negative numbers:: "
                        + inputList.stream()
                                .mapToInt(i -> Integer.valueOf(i))
                                .filter(i -> i < 0)
                                .average()
                                .getAsDouble());

                break;
            case "p":

                System.out.println("Average of the positive numbers: "
                        + inputList.stream()
                                .mapToInt(i -> Integer.valueOf(i))
                                .filter(i -> i > 0)
                                .average()
                                .getAsDouble());

                break;

        }

    }

}
