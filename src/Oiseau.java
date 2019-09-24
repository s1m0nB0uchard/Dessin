import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.util.Duration;

public class Oiseau extends Group {

    public  Oiseau(){
        QuadCurve aileGauche = new QuadCurve(0,45,20,7,30,30);
        aileGauche.setStroke(Color.BLACK);
        aileGauche.setFill(Color.TRANSPARENT);
        aileGauche.setStrokeWidth(3);

        QuadCurve aileDroite = new QuadCurve(30,30,40,7,60,45);
        aileDroite.setStroke(Color.BLACK);
        aileDroite.setFill(Color.TRANSPARENT);
        aileDroite.setStrokeWidth(3);

        Group oiseau = new Group();
        oiseau.getChildren().addAll(aileDroite,aileGauche);

        KeyValue kv = new KeyValue(aileDroite.startYProperty(),35);
        KeyValue kv2 = new KeyValue(aileDroite.endYProperty(), 10);
        KeyValue kv3 = new KeyValue(aileDroite.controlXProperty(),30);
        KeyValue kv4 = new KeyValue(aileGauche.endYProperty(),35);
        KeyValue kv5 = new KeyValue(aileGauche.startYProperty(), 10);
        KeyValue kv6 = new KeyValue(aileGauche.controlXProperty(),30);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv,kv2,kv3,kv4,kv5,kv6);

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(kf);
        timeline.setAutoReverse(true);

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        getChildren().addAll(aileGauche, aileDroite);
    }
}
