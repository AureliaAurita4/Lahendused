package eksamiYlesanneteLahendused;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */

public class PixelChaser extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PixelChaser");

        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(100,50);
            rectangle.setFill(Color.CADETBLUE);
            pane.getChildren().add(rectangle);

            rectangle.setLayoutX(Math.random() * 500);
            rectangle.setLayoutY(Math.random() * 500);

            rectangle.setOnMouseClicked(event -> {
                if (rectangle.getWidth() == 100) {
                    rectangle.setWidth(50);
                    rectangle.setHeight(25);
                } else {
                    pane.getChildren().remove(rectangle);
                }
            });
        }

        primaryStage.show();
    }
}
