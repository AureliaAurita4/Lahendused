package eksamiYlesanneteLahendused;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */

public class FooridUnenaos extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FooridUnenaos");

        for (int i = 0; i < 15; i++) {
            Circle ring = new Circle(20);
            ring.setFill(Color.RED);
            pane.getChildren().add(ring);

            ring.setLayoutX(Math.random() * 500);
            ring.setLayoutY(Math.random() * 500);

            ring.setOnMouseEntered(event -> {
                ring.setFill(Color.GREEN);
            });
        }
        
        primaryStage.show();

    }
}
