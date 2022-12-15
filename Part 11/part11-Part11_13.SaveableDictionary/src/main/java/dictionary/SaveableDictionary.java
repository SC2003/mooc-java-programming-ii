package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private HashMap<String, String> dictionaryReverse;
    private String fileName;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.dictionaryReverse = new HashMap<>();
        this.fileName = null;
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.dictionaryReverse = new HashMap<>();
        this.fileName = file;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
        this.dictionaryReverse.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        if (this.dictionary.getOrDefault(word, null) == null) {
            return this.dictionaryReverse.getOrDefault(word, null);
        }
        return this.dictionary.getOrDefault(word, null);
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            String translation = this.dictionary.get(word);
            this.dictionaryReverse.remove(translation);
            this.dictionary.remove(word);
        }

        if (this.dictionaryReverse.containsKey(word)) {
            String translation = this.dictionaryReverse.get(word);
            this.dictionary.remove(translation);
            this.dictionaryReverse.remove(word);
        }
    }

    public boolean load() {
        try (Scanner reader = new Scanner(Paths.get(this.fileName))) {
            while (reader.hasNextLine()) {
                String content = reader.nextLine();
                String[] parts = content.split(":");
                this.add(parts[0].trim(), parts[1].trim());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        //return false;
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.fileName)) {
            for (String word : this.dictionary.keySet()) {
                writer.println(word + ":" + this.dictionary.get(word));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        //return false;
    }
}
