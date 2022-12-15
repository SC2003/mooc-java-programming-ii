
import java.util.ArrayList;
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> directory;

    public Abbreviations() {
        this.directory = new HashMap<>();
    }

    public void addAbbreviation(String abbreviations, String explanation) {
        if (hasAbbreviation(abbreviations)) {
            System.out.println("Abbreviations Already Exists!!");
            return;
        }
        this.directory.put(abbreviations, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.directory.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        if (hasAbbreviation(abbreviation)) {
            return this.directory.get(abbreviation);
        }
        return null;
    }

    public static String sanitizedString(String text) {
        if (text == null) {
            return "";
        }
        return text.toLowerCase().trim();
    }
}
