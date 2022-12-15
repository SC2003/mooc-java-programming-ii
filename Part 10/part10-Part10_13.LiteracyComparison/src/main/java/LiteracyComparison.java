
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        String fileName = "literacy.csv";

        List<String> statsFromFile = readFile(fileName);
        List<Person> test = new ArrayList<>();
        statsFromFile.stream()
                .map(row -> row.split(","))
                .map(parts -> new Person(fixGender(parts[2].trim()), parts[3].trim(), Integer.valueOf(parts[4].trim()), Double.valueOf(parts[5].trim())))
                .forEach(Person -> test.add(Person));

        test.stream()
                .sorted((p1, p2) -> {
                    return p1.compareTo(p2);
                }).forEach(System.out::println);
    }

    public static List<String> readFile(String file) {
        try {
            return (Files.lines(Paths.get(file))
                    .collect(Collectors.toList()));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    public static String fixGender(String gender) {
        if (gender.contains("female")) {
            return "female";
        }
        return "male";
    }
}
