/**This class extends the Scenery class and creates the animal(bear) which is needed to be shown in the window
 * I used instance variables for each body part of the bear and gave it brown color
 */

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
public class Bear {
    private Ellipse head;//head of the bear
    private Ellipse body;//body of the bear
    private Ellipse legs1;//1 leg of the bear
    private Ellipse legs2;//2nd leg of the bear
    private Ellipse arm1;//1st leg of the bear
    private Ellipse arm2;//2nd leg of the bear
    private Ellipse ear1;//1st ear of the bear
    private Ellipse ear2;//2nd ear of the bear
    private Ellipse eye1;//1st eye of the bear
    private Ellipse eye2;//2nd eye of the bear
    private Polygon nose;//nose of the bear
    private Arc mouth;//mouth of the bear

    //the constructor below creates the animal using different instance variables by taking vales for x and y which the position of the bear
    public Bear(int x, int y) {
        head = new Ellipse(400, 220, 44, 45);
        head.setFill(Color.BROWN);// to fill brown color in bear
        body = new Ellipse(400, 300, 70, 80);
        body.setFill(Color.BROWN);
        legs1 = new Ellipse(375, 350, 20, 80);
        legs2 = new Ellipse(420,350,20, 80);
        legs1.setFill(Color.BROWN);
        legs2.setFill(Color.BROWN);
        arm1 = new Ellipse(356, 270, 20, 80);
        arm1.setFill(Color.BROWN);
        arm1.setRotate(-60);//to rotate the ellipse to give the shape of arm
        arm2 = new Ellipse(442, 270, 20, 80);
        arm2.setFill(Color.BROWN);
        arm2.setRotate(60);
        ear1 = new Ellipse(360, 200, 20, 32);
        ear1.setFill(Color.BROWN);
        ear1.setRotate(-40);
        ear2 = new Ellipse(440, 200, 20, 32);
        ear2.setFill(Color.BROWN);
        ear2.setRotate(40);
        eye1 = new Ellipse(380, 205, 5, 5);
        eye2 = new Ellipse(420, 205, 5, 5);
        double[] nosePoints = {400,220 , 394,227 , 406,227};
        nose = new Polygon(nosePoints);
        mouth = new Arc(400, 217, 30, 30, 210, 120);
        mouth.setStrokeWidth(2);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.TRANSPARENT);
    }

    //this method adds all the nodes that is different parts of the bear together
    public Node[] getAllNodes() {
        return new Node[]{head, body, legs1,legs2,arm1, arm2,ear1, ear2,eye1,eye2, nose, mouth};
    }
}
