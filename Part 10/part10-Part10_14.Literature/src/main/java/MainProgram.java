
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String bookName = scanner.nextLine();
            if (bookName.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int recAge = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(bookName, recAge));
        }

        System.out.println(bookList.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        bookList.stream()
                .sorted((b1, b2) -> {

                    return b1.getBookName().compareTo(b2.getBookName());

                })
                .sorted((b1, b2) -> {

                    return b1.getRecommendedAge() - b2.getRecommendedAge();

                })
                .forEach(System.out::println);

    }

}
