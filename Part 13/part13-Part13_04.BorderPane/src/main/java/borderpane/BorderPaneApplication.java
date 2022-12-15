package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane container = new BorderPane();
        container.setTop(new Label("NORTH"));
        container.setRight(new Label("EAST"));
        container.setBottom(new Label("SOUTH"));

        Scene view = new Scene(container);

        window.setScene(view);
        window.setTitle("BorderPane App");
        window.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

}
