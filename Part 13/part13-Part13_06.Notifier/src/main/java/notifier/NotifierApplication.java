package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        VBox colLayout = new VBox();
        //colLayout.setSpacing(20);
        
        TextField text = new TextField();
        
        Button btn = new Button("Update");
        
        Label textInfo = new Label();
        
        btn.setOnAction((e) -> {
            textInfo.setText(text.getText());
        });
        
        colLayout.getChildren().addAll(text, btn, textInfo);
        
        Scene viewport = new Scene(colLayout);
        
        window.setScene(viewport);
        window.setTitle("Notifier App");
        window.show();
    }
    
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
    
}
