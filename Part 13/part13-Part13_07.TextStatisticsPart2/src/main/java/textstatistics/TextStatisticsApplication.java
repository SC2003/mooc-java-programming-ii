package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        TextArea textArea = new TextArea("");

        HBox rowLayout = new HBox();
        rowLayout.setSpacing(20);

        Label letters = new Label("Letters: ");
        Label words = new Label("Words: ");
        Label length = new Label("The longest word is: ");

        rowLayout.getChildren().addAll(letters, words, length);

        layout.setCenter(textArea);
        layout.setBottom(rowLayout);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {

            //Data
            int letterCount = newValue.length();
            String[] parts = newValue.split(" ");
            int wordCount = parts.length;

            String longestWord = Arrays.stream(parts)
                    .sorted((s1, s2) -> {
                        return s2.length() - s1.length();
                    })
                    .findFirst()
                    .get();

            //Inseting Data in UI
            letters.setText("Letters: " + letterCount);
            words.setText("Words: " + wordCount);
            length.setText("The longest word is: " + longestWord);
        });

        Scene view = new Scene(layout);

        window.setTitle("TextStatistics App");
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
