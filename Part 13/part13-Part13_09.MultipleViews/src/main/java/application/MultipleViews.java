package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {

        //First Scene Layout
        BorderPane firstLayout = new BorderPane();

        Label firstText = new Label("First view!");
        Button firstBtn = new Button("To the second view!");

        firstLayout.setTop(firstText);
        firstLayout.setCenter(firstBtn);

        //Second Scene Layout
        VBox secondLayout = new VBox();

        Label secondText = new Label("Second view!");
        Button secondBtn = new Button("To the third view!");

        secondLayout.getChildren().addAll(secondBtn, secondText);

        //Third Scene Layout
        GridPane thirdLayout = new GridPane();

        Label thirdText = new Label("Third view!");
        Button thirdBtn = new Button("To the first view!");

        thirdLayout.add(thirdText, 0, 0);
        thirdLayout.add(thirdBtn, 1, 1);

        //First Scene
        Scene firstScene = new Scene(firstLayout);
        //Second Scene
        Scene secondScene = new Scene(secondLayout);
        //Third Scene
        Scene thirdScene = new Scene(thirdLayout);

        //Action Handlers
        firstBtn.setOnAction(e -> {
            window.setScene(secondScene);
            window.setTitle("Second Scene");
        });
        secondBtn.setOnAction(e -> {
            window.setScene(thirdScene);
            window.setTitle("Third Scene");
        });
        thirdBtn.setOnAction(e -> {
            window.setScene(firstScene);
            window.setTitle("First Scene");
        });

        //Default Window Setup
        window.setScene(firstScene);
        window.setHeight(500);
        window.setWidth(800);
        window.setTitle("First Scene");
        window.show();
    }

}
