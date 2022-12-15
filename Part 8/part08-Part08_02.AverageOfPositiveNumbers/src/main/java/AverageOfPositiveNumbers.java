
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        while (true) {
            int inputNum = Integer.valueOf(scanner.nextLine());
            if (inputNum == 0) {
                break;
            }
            if (inputNum < 0) {
                continue;
            }
            numberList.add(inputNum);
        }
        int sum = 0;
        if (numberList.size() == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }
        for (int num : numberList) {
            sum += num;
        }
        System.out.println((double) sum / numberList.size());
    }

}
