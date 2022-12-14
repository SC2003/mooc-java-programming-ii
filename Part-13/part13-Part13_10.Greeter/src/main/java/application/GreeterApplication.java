package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        
        GridPane layout = new GridPane();

        Label text = new Label("Enter your name and start.");
        TextField textForm = new TextField();
        Button btn = new Button("Start");

        layout.add(text, 0, 0);
        layout.add(textForm, 0, 1);
        layout.add(btn, 0, 2);
        
        layout.setPrefSize(600, 300);
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene firstView = new Scene(layout);
        
        StackPane secondLayout = new StackPane();
        Label welcomeText = new Label("Welcome {userName}!");
        
        secondLayout.getChildren().add(welcomeText);
        
        secondLayout.setPrefSize(600, 300);
        secondLayout.setAlignment(Pos.CENTER);
        
        Scene secondView = new Scene(secondLayout);
        
        btn.setOnAction(e -> {
        
            welcomeText.setText("Welcome " + textForm.getText() + "!");
            window.setScene(secondView);
            
        });
        
        window.setTitle("Greeter App");
        window.setScene(firstView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
