package smiley;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {

        Canvas canvas = new Canvas(480, 480);

        GraphicsContext painter = canvas.getGraphicsContext2D();

        BorderPane layout = new BorderPane();

        layout.setCenter(canvas);
        layout.setPadding(new Insets(10, 10, 10, 10));

        painter.setFill(Color.BLACK);
        painter.fillRect(120, 120, 50, 50);
        painter.fillRect(320, 120, 50, 50);
        painter.fillRect(120, 360, 250, 50);
        painter.fillRect(70, 310, 50, 50);
        painter.fillRect(370, 310, 50, 50);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.setTitle("Smiley App");
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
