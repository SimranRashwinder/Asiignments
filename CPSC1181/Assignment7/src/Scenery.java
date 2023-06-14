/**This is the Assignment 7 created by NAME: SIMRAN, SID: 100377444, Course Name: CPSC 1181
 * In this assignment, I have 3 classes: Scenery, Tree ands Bear. Scenery class contains the main method and other the two classes inherits from this class.I used the code of assignment6 in this.
 * In Scenery class, I have created checkboxes, radiobuttons, button, text field etc.
 * Scenery extends the JavaFX Application.
 */

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Scenery extends Application {
    private Text message;
    private CheckBox rainbowCheck;
    private CheckBox smileCheck;
    private ToggleGroup rotate;
    private TextField captionTextField;
    private Ellipse rainbow;
    private Ellipse smile;
    private Ellipse eye1;
    private  Ellipse eye2;
    private Arc mouth;
    private RadioButton turn0;
    private RadioButton turn90;
    private  RadioButton turn180;
    private RadioButton turn270;
    private final String initialMessage = "HELLO EVERYONE";
    private final int fontSize = 95;
    private Pane rootScene;
    private Group Smile;
    private Group Rainbow;



    //main method
    public static void main(String[] args) {
        launch(args);
    }
    private class showRainbow implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            if (rainbowCheck.isSelected()) {
                rainbow.setVisible(false);
            }
        }
    }

    //start method and I have Override it to make the changes needed
    @Override
    public void start(Stage primaryStage) {
        rootScene = new Pane();
        rootScene.setPrefHeight(500);
        rootScene.setPrefWidth(600);
        Rectangle ground = new Rectangle(0, 400, 600, 100);//this is the ground on which trees and bear stands
        ground.setFill(Color.DARKGREEN);
        //to cut off the separate edge of the rainbow
        Rectangle clip = new Rectangle(0,0,600,500);
        rootScene.setClip(clip);

        /**Below is the code to create the rainbow. I used the same method as I used in Lab6 for this step
         * I created an array of colors and then used for loop to create the different strips of the rainbow
         */
        Color[] colors = {Color.WHITE,Color.PURPLE,Color.INDIGO,Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};

            Ellipse rainbow1 = new Ellipse(310, 310, 360 + 7 , 250 + 7 );
            Ellipse rainbow2 = new Ellipse(310, 310, 360 + 14, 250 + 14);
            Ellipse rainbow3 = new Ellipse(310, 310, 360 + 21, 250 + 21);
            Ellipse rainbow4 = new Ellipse(310, 310, 360 + 28, 250 + 28);
            Ellipse rainbow5 = new Ellipse(310, 310, 360 + 35, 250 + 35);
            Ellipse rainbow6 = new Ellipse(310, 310, 360 + 42, 250 + 42);
            Ellipse rainbow7 = new Ellipse(310, 310, 360 + 49, 250 + 49);
            rainbow1.setFill(Color.TRANSPARENT);
            rainbow2.setFill(Color.TRANSPARENT);
            rainbow3.setFill(Color.TRANSPARENT);
            rainbow4.setFill(Color.TRANSPARENT);
            rainbow5.setFill(Color.TRANSPARENT);
            rainbow6.setFill(Color.TRANSPARENT);
            rainbow7.setFill(Color.TRANSPARENT);
            rainbow1.setStroke(Color.PURPLE);
            rainbow2.setStroke(Color.INDIGO);
            rainbow3.setStroke(Color.BLUE);
            rainbow4.setStroke(Color.GREEN);
            rainbow5.setStroke(Color.YELLOW);
            rainbow6.setStroke(Color.ORANGE);
            rainbow7.setStroke(Color.RED);
            rainbow1.setStrokeWidth(7);
            rainbow2.setStrokeWidth(7);
            rainbow3.setStrokeWidth(7);
            rainbow4.setStrokeWidth(7);
            rainbow5.setStrokeWidth(7);
            rainbow6.setStrokeWidth(7);
            rainbow7.setStrokeWidth(7);
            Rainbow = new Group();
            Rainbow.getChildren().addAll(rainbow1,rainbow2,rainbow3,rainbow4,rainbow5,rainbow6,rainbow7);

//        Rainbow = new Group();
//        Rainbow.getChildren().add(rainbow);
          rootScene.getChildren().add(Rainbow);
        Rainbow.setVisible(false);
        rootScene.getChildren().add(ground);
        Smile = new Group();
        smile = new Ellipse(300,100,50,50);
        smile.setFill(Color.TRANSPARENT);
        smile.setStroke(Color.BLACK);
        smile.setStrokeWidth(2);
        eye1 = new Ellipse(275, 80, 5, 5);
        eye2 = new Ellipse(325, 80, 5, 5);
        mouth = new Arc(300, 100, 30, 30, 210, 120);
        mouth.setStrokeWidth(2);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.TRANSPARENT);
        Smile.getChildren().addAll(smile,eye1,eye2,mouth);
        rootScene.getChildren().add(Smile);
        Smile.setVisible(false);

        //Below is the code to add the trees ion the pane
        Tree t1 = new Tree (100, 420);
        rootScene.getChildren().addAll(t1.getAllNodes());

        Tree t2 = new Tree(200, 440, 100, 100, Color.rgb(100, 100, 80));
        rootScene.getChildren().addAll(t2.getAllNodes());

        Tree t3 = new Tree(250, 440, 100, 250, Color.rgb(120, 120, 10));
        rootScene.getChildren().addAll(t3.getAllNodes());

        //Below is the code to add the animal bear
        Bear b1 = new Bear(350,440);
        rootScene.getChildren().addAll(b1.getAllNodes());
        //To add a message in the pane
        message = new Text(150,180,initialMessage);
        rootScene.getChildren().add(message);
        message.setFont(Font.font("Arial,fontSize"));

        //adding left-hand side of the GUI window
        Text background = new Text(10,4,"Background");
        Text caption = new Text(50,300,"Caption");

        captionTextField = new TextField(initialMessage);

        Button changeTextButton = new Button("Change Text");
        changeTextButton.setOnAction(new MessageEvent());

        //to add the checkboxes
        rainbowCheck = new CheckBox("Rainbow");
        smileCheck = new CheckBox("Smile");
        //To add radio buttons
        turn0 = new RadioButton("Smiley face");
        turn90 = new RadioButton("no mouth");
        turn180= new RadioButton("sad face");
        turn270 = new RadioButton("open mouth");

        rotate = new ToggleGroup();
        turn0.setToggleGroup(rotate);
        turn90.setToggleGroup(rotate);
        turn180.setToggleGroup(rotate);
        turn270.setToggleGroup(rotate);

        //Creating VBox to add the checkboxes and radio buttons
        VBox leftHSide = new VBox(5.8,background,rainbowCheck,smileCheck,turn0, turn90, turn180, turn270, caption,captionTextField,changeTextButton);

        //Creating a borderpane and adding elements to it
        BorderPane root = new BorderPane();
        root.setRight(rootScene);
        root.setLeft(leftHSide);
        root.setPadding(new Insets(5));

        //The following steps create the scene window with title JavaFX Trees
        Scene scene = new Scene(root);
        primaryStage.setTitle("JavaFX Trees");
        primaryStage.setScene(scene);
        primaryStage.show();


        MessageEvent meh = new MessageEvent();
        changeTextButton.setOnAction(meh);
        captionTextField.setOnAction(meh);
        turn0.setOnAction(meh);
        turn90.setOnAction(meh);
        turn180.setOnAction(meh);
        turn270.setOnAction(meh);
        showRainbow show = new showRainbow();
        showSmile showS = new showSmile();
        rainbowCheck.setOnAction(showS);
        smileCheck.setOnAction(showS);

    }
    private class MessageEvent implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            message.setText(captionTextField.getText());

            if(turn90.isSelected()){
                mouth.setRadiusX(1000);
                mouth.setStartAngle(300);
                mouth.setLength(90);

            }
            if(turn180.isSelected()) {
                mouth.setRotate(180);
            }
            if(turn270.isSelected()){
               mouth.setType(ArcType.CHORD);
            }

        }
    }
    private class showSmile implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            if(smileCheck.isSelected()){
                Smile.setVisible(true);
            }
            if(rainbowCheck.isSelected()){
                Rainbow.setVisible(true);
            }

        }
    }



}
