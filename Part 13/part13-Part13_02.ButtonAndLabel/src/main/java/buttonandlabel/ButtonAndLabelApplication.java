package buttonandlabel;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ButtonAndLabelApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Button myButton = new Button("My Button");

        Label myLable = new Label(" <- This is a button");

        FlowPane componentGroup = new FlowPane();

        componentGroup.getChildren().add(myButton);
        componentGroup.getChildren().add(myLable);

        Scene view = new Scene(componentGroup);

        stage.setTitle("Another One!!");
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
