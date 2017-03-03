package eksamiYlesanneteLahendused;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;

/**
 * Created by svetlana on 4.03.17.
 */
public class Ylesanne extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        double summa = 0;
        double summa2 = 0;
        HashMap<String, Double> koikKulud = new HashMap<>();


        VBox vBox = new VBox();
        Scene scene = new Scene(vBox, 300, 300);
        primaryStage.setScene(scene);

        Label l1 = new Label("Summa2");
        vBox.getChildren().add(l1);

        TextField text1 = new TextField();
        text1.setMaxWidth(150);
        vBox.getChildren().add(text1);

        Button b1 = new Button("Jäta meelde");
        b1.setTranslateY(40);
        vBox.getChildren().add(b1);

        primaryStage.show();

        b1.setOnAction(event -> {

            summa2 += Double.parseDouble(text1.getText());

            VBox vBox1 = new VBox();
            Scene scene1 = new Scene(vBox1, 300, 300);
            primaryStage.setScene(scene1);
            text1.clear();

            Label l2 = new Label("Summa nimetus: ");
            vBox1.getChildren().add(l2);

            TextField text2 = new TextField();
            text2.setMaxWidth(150);
            vBox1.getChildren().add(text2);

            Label l3 = new Label("Summa");
            vBox1.getChildren().add(l3);

            TextField text3 = new TextField();
            text3.setMaxWidth(150);
            vBox1.getChildren().add(text3);

            Button b2 = new Button("Arvesta");
            b2.setTranslateY(40);
            vBox1.getChildren().add(b2);


            b2.setOnAction(event1 -> {

                String summaStr = text2.getText();
                double summaDoub = Double.parseDouble(text3.getText());
                summa += summaDoub;

                koikKulud.put(summaStr, summaDoub);

            });

            Button b3 = new Button("Statistika");
            b3.setTranslateY(40);
            vBox1.getChildren().add(b3);

            b3.setOnAction(event1 -> {

                Arvutused arv = new Arvutused();
                double arv1 = arv.paljuAlles(summa2, summa);

                Label l5 = new Label();
                l5.setText(Double.toString(arv1));
                l5.setTranslateY(60);
                vBox1.getChildren().add(l5);

                arv.suurimSumma(koikKulud);
            });

        });
    }

}
