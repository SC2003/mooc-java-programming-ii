
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translationList = this.dictionary.get(word);
        translationList.add(translation);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> translationList = new ArrayList<>();
        if (this.dictionary.containsKey(word)) {
            translationList = this.dictionary.get(word);
        }
        return translationList;
    }

    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
    }
}
