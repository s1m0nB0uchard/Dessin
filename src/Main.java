import javafx.animation.FillTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage) {

        //lune

        Ellipse lune = new Ellipse(300, 75, 30, 30);
        Stop stops[] = new Stop[]{new Stop(0, Color.BROWN), new Stop(1, Color.DARKGRAY)};
        LinearGradient degradeLune = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE, stops);
        lune.setFill(degradeLune);

        //lune

        Group soleil = new Soleil();
        soleil.setTranslateX(660);
        soleil.setTranslateY(40);

        //jour/nuit

        Group dayNight = new Group();
        Rectangle rectNuit = new Rectangle(0, 0, 400, 400);
        rectNuit.setFill(Color.BLACK);
        Rectangle rectJour = new Rectangle(400, 0, 400, 400);
        rectJour.setFill(Color.grayRgb(50, 0.2));
        dayNight.getChildren().addAll(rectNuit, rectJour);

        //texte

        Text day = new Text(rectJour.getWidth() + 170, 350, "Jour");
        day.setFont(new Font(30));
        Text night = new Text(170, 350, "Nuit");
        night.setFont(new Font(30));
        night.setStroke(Color.WHITE);
        night.setFill(Color.WHITE);
        Group text = new Group(day, night);

        //maison

        Maison maisonNuit = new Maison();
        maisonNuit.setTranslateX(rectNuit.getWidth() / 2 - 50);
        maisonNuit.setTranslateY(170);
        Maison maisonJour = new Maison();
        maisonJour.setTranslateX(rectNuit.getWidth() + (rectJour.getWidth() / 2) - 50);
        maisonJour.setTranslateY(170);
        DropShadow ds = new DropShadow(5, -10, 10, Color.BLACK);
        maisonJour.setEffect(ds);
        Group maisons = new Group(maisonJour, maisonNuit);

        //oiseau

        Oiseau oiseau1 = new Oiseau();
        oiseau1.setTranslateX(550);
        oiseau1.setTranslateY(20);

        Oiseau oiseau2 = new Oiseau();
        oiseau2.setTranslateX(450);
        oiseau2.setTranslateY(100);

        //etoiles

        Group groupeEtoiles = new Group();
        Etoiles etoile1 = new Etoiles(0.5);
        etoile1.setTranslateY(50);
        etoile1.setTranslateX(20);
        Etoiles etoile2 = new Etoiles(1);
        etoile2.setTranslateY(130);
        etoile2.setTranslateX(40);
        Etoiles etoile3 = new Etoiles(0.75);
        etoile3.setTranslateY(50);
        etoile3.setTranslateX(100);
        Etoiles etoile4 = new Etoiles(0.3);
        etoile3.setTranslateY(50);
        etoile3.setTranslateX(170);
        groupeEtoiles.getChildren().addAll(etoile1, etoile2, etoile3,etoile4);


        Group complet = new Group();
        complet.getChildren().addAll(dayNight, maisons, text, soleil, lune, oiseau1, oiseau2, groupeEtoiles);

        Stage window = primaryStage;
        window.setTitle("DESSIN");
        Scene scene = new Scene(complet, 800, 400);
        window.setScene(scene);
        window.show();


    }


}
