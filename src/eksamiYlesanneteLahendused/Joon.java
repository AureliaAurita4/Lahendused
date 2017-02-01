package eksamiYlesanneteLahendused;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */

public class Joon extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Joon");

        //Labels
        Label label1 = new Label();
        label1.setTranslateX(40);
        label1.setTranslateY(18);
        label1.setText("Sisesta algus-kordinaat");
        vbox.getChildren().add(label1);

        Label label2 = new Label();
        label2.setTranslateX(300);
        label2.setText("Sisesta lõpp-kordinaat");
        vbox.getChildren().add(label2);

        //TextFields
        //Start point
        TextField field1 = new TextField();
        field1.setTranslateX(40);
        field1.setTranslateY(6);
        field1.setMaxSize(100, 50);
        field1.setPromptText("x: 0-500");
        vbox.getChildren().add(field1);

        TextField field2 = new TextField();
        field2.setTranslateX(40);
        field2.setTranslateY(6);
        field2.setMaxSize(100, 50);
        field2.setPromptText("y: 0-500");
        vbox.getChildren().add(field2);

        //End point
        TextField field3 = new TextField();
        field3.setTranslateX(300);
        field3.setTranslateY(-45);
        field3.setMaxSize(100, 50);
        field3.setPromptText("x: 0-500");
        vbox.getChildren().add(field3);

        TextField field4 = new TextField();
        field4.setTranslateX(300);
        field4.setTranslateY(-45);
        field4.setMaxSize(100, 50);
        field4.setPromptText("y: 0-500");
        vbox.getChildren().add(field4);

        //Button
        Button button = new Button();
        button.setTranslateX(200);
        button.setTranslateY(-30);
        button.setText("Joonista");
        vbox.getChildren().add(button);

        primaryStage.show();

        button.setOnAction(event -> {
            int x1 = Integer.parseInt(field1.getText());
            int y1 = Integer.parseInt(field2.getText());
            int x2 = Integer.parseInt(field3.getText());
            int y2 = Integer.parseInt(field4.getText());

            Line line = new Line(x1, y1, x2, y2);
            Pane pane = new Pane();
            Scene scene2 = new Scene(pane, 500, 500);
            pane.getChildren().add(line);
            primaryStage.setScene(scene2);
        });
    }
}
