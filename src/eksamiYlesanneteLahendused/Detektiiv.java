package eksamiYlesanneteLahendused;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Detektiiv");

        for (int i = 0; i < 3; i++) {
            Circle ring = new Circle(70);
            ring.setFill(Color.TRANSPARENT);

            ring.setLayoutX(Math.random() * 500);
            ring.setLayoutY(Math.random() * 500);

            pane.getChildren().add(ring);

            ring.setOnMouseEntered(event -> {
                ring.setFill(Color.CADETBLUE);

            });
        }

        primaryStage.show();
    }
}