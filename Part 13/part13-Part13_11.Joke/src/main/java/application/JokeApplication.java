package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) {

        BorderPane layout = new BorderPane();
        HBox menu = new HBox();

        Button qBtn = new Button("Joke");
        Button aBtn = new Button("Answer");
        Button eBtn = new Button("Explanation");

        menu.getChildren().addAll(qBtn, aBtn, eBtn);

        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        layout.setTop(menu);

        String jokeQuestion = "What do you call a bear with no teeth?";
        String jokeAnswer = "A gummy bear.";
        String jokejokeQuestion = "Damn you need an explation? \nget outta here";

        StackPane qSceneLayout = createView(jokeQuestion);
        StackPane aSceneLayout = createView(jokeAnswer);
        StackPane eSceneLayout = createView(jokejokeQuestion);

        layout.setCenter(qSceneLayout);
        Scene view = new Scene(layout);

        qBtn.setOnAction(e -> layout.setCenter(qSceneLayout));
        aBtn.setOnAction(e -> layout.setCenter(aSceneLayout));
        eBtn.setOnAction(e -> layout.setCenter(eSceneLayout));

        window.setTitle("Jokes App");
        window.setScene(view);
        window.show();
    }

    private StackPane createView(String text) {
        StackPane layout = new StackPane();

        layout.getChildren().add(new Label(text));

        layout.setPrefSize(600, 300);
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
