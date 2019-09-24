import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

import java.util.Random;
import java.util.Stack;


public class Etoiles extends Group {


    Polygon etoile;


    public Etoiles(double facteur) {


        Random random = new Random();

        etoile = new Polygon(20, 0, 15, 15, 0, 15, 10, 25, 5, 40, 20, 30, 35, 40, 30, 25, 40, 15, 25, 15);
        etoile.setFill(Color.YELLOW);

        etoile.setScaleX(facteur);
        etoile.setScaleY(facteur);

        FadeTransition ft = new FadeTransition(Duration.seconds(random.nextInt(4) + 1),etoile );
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

        getChildren().addAll(etoile);
    }

}
