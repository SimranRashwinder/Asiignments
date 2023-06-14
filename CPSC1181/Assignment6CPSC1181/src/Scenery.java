/**This is the Assignment 6 created by NAME: SIMRAN, SID: 100377444, Course Name: CPSC 1181
 * In this assignment, I have 3 classes: Scenery, Tree ands Bear. Scenery class contains the main method and other the two classes inherits from this class.
 * In Scenery class, I have created a start method to draw the ground, rainbow, tree and bear(animal). I used the code provided by professor and made the changes that were needed.
 * Scenery extends the JavaFX Application.
 */

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Scenery extends Application {
    //main method
    public static void main(String[] args) {
        launch(args);
    }

    //start method and I have Override it to make the changes needed
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Rectangle ground = new Rectangle(0, 400, 600, 100);//this is the ground on which trees and bear stands
        ground.setFill(Color.DARKGREEN);

        /**Below is the code to create the rainbow. I used the same method as I used in Lab6 for this step
         * I created an array of colors and then used for loop to create the different strips of the rainbow
         */
        Color[] colors = {Color.WHITE,Color.PURPLE,Color.INDIGO,Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};

        for (int i = 0; i <colors.length ; i++) {
            Ellipse rainbow = new Ellipse(310,310,320+7*i, 250+7*i);
            rainbow.setFill(Color.TRANSPARENT);
            rainbow.setStroke(colors[i]);
            rainbow.setStrokeWidth(7);
            root.getChildren().add(rainbow);
        }
        root.getChildren().add(ground);

        //Below is the code to add the trees ion the pane
        Tree t1 = new Tree (100, 420);
        root.getChildren().addAll(t1.getAllNodes());

        Tree t2 = new Tree(200, 440, 100, 100, Color.rgb(100, 100, 80));
        root.getChildren().addAll(t2.getAllNodes());

        Tree t3 = new Tree(250, 440, 100, 250, Color.rgb(120, 120, 10));
        root.getChildren().addAll(t3.getAllNodes());

        //Below is the code to add the animal bear
        Bear b1 = new Bear(350,440);
        root.getChildren().addAll(b1.getAllNodes());

        //The following steps create the scene window with title JavaFX Trees
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("JavaFX Trees");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
