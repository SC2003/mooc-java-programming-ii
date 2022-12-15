package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage window) {
        
        Button btn = new Button("Click Me!");

        TextField text = new TextField(" <- look at that thing");

        FlowPane container = new FlowPane();

        container.getChildren().add(btn);
        container.getChildren().add(text);

        Scene view = new Scene(container);

        window.setScene(view);
        window.setTitle("Button & TextField Example");
        window.show();

    }

    public static void main(String[] args) {

        launch(ButtonAndTextFieldApplication.class);

    }

}
