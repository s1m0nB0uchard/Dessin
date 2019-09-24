import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.animation.StrokeTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.util.Duration;


public class Soleil extends Group {

    public Soleil() {
        Ellipse soleil = new Ellipse(50, 50, 30, 30);
        soleil.setFill(Color.YELLOW);
        FillTransition transSoleil = new FillTransition(Duration.seconds(3), soleil);
        transSoleil.setToValue(Color.ORANGE);
        transSoleil.setCycleCount(Timeline.INDEFINITE);
        transSoleil.setAutoReverse(true);
        transSoleil.play();

        //rayons


        Line rayon1 = new Line(-15, 50, 15, 50);
        Line rayon2 = new Line(50, 80, 50, 110);
        Line rayon3 = new Line(85, 50, 115, 50);
        Line rayon4 = new Line(50, -15, 50, 15);
        Line rayon5 = new Line(10,10,25,25);
        Line rayon6 = new Line(75,75,90,90);
        Line rayon7 = new Line(75,25, 90,10);
        Line rayon8 = new Line(10,90,25,75);

        Line tabRayons[] = {rayon1,rayon2,rayon3,rayon4,rayon5,rayon6,rayon7,rayon8};

        for (Line rayon:tabRayons) {
            rayon.setStroke(Color.YELLOW);
            StrokeTransition trans = new StrokeTransition(Duration.seconds(1), rayon);
            trans.setToValue(Color.ORANGE);
            trans.setCycleCount(Timeline.INDEFINITE);
            trans.setAutoReverse(true);
            trans.play();

        }

        Group rayons = new Group();
        rayons.getChildren().addAll(rayon1, rayon2, rayon3, rayon4,rayon5,rayon6,rayon7,rayon8);
        RotateTransition transition = new RotateTransition(Duration.seconds(5), rayons);
        transition.setByAngle(360);
        transition.setCycleCount(Timeline.INDEFINITE);
        transition.play();


        getChildren().addAll(soleil, rayons);
    }
}
