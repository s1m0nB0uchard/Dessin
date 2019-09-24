import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Maison extends Group{

    public Maison(){
        //forme maison
        Polygon triangle = new Polygon(50,0,0,40,100,40);
        triangle.setFill(Color.RED);
        Rectangle contour = new Rectangle(10,40,80,50);
        contour.setFill(Color.BEIGE);
        //porte
        Rectangle porte = new Rectangle(20,60,20,30);
        porte.setFill(Color.BROWN);
        //fenetre
        Rectangle fenetre = new Rectangle(50,60,30,15);
        fenetre.setFill(Color.DEEPSKYBLUE);
        fenetre.setStroke(Color.WHITE);
        Line ligneVerticale = new Line(65,60,65,75);
        ligneVerticale.setStrokeWidth(2);
        ligneVerticale.setStroke(Color.WHITE);
        Line ligneHorizontale = new Line(50,67.5,80,67.5);
        ligneHorizontale.setStrokeWidth(2);
        ligneHorizontale.setStroke(Color.WHITE);

        //poignée
        Ellipse poignee = new Ellipse(35,75,3,3);
        poignee.setFill(Color.YELLOW);

        getChildren().addAll(contour, triangle,porte,fenetre,ligneVerticale,ligneHorizontale,poignee);
    }
}
