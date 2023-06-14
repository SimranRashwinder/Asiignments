/**This assignment Assignment8 is created by Name: Simran, Course:CPSC 1181.
 * I worked according to  the instructions provided by professor and used the information from the lecture codes and from things taught in the class
 * I created a start method, an inner class ballAnimation which extends AnimationTimer and other methods creating and running the layout
 * For addition, I made the color of the ball to change when hit is done and the size of hits and misses represented on the screen will increase or decrease based on the click
 */

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.Random;

public class MouseGame extends Application {
    private Button pauseButton;//this button pauses the game
    private Button resetButton;//this button starts the game from beginning
    private Rectangle background;//this creates the black background for the game
    private Text Hits;//this is text
    private Text Misses;//this is also a text
    private int noHits = 0;//this represents the hits
    private int noMisses = 0;//represents misses
    private Text gameOver;
    private Ellipse ball;//this is ball
    private int xVelocity = 3;//velocity for moving the ball
    private ballAnimation animation;//this is to start the animation
    private Pane root;
    private final int maxMisses = 5;
    private boolean pause = true;




    //The main method
    public static void main(String args[]) {
        launch(args);
    }

    //Start method
    @Override
    public void start(Stage primaryStage) {
        //Firstly I created the GUI layout which is visible on the screen
        pauseButton = new Button("Pause");
        pauseButton.setLayoutX(280);
        pauseButton.setLayoutY(405);
        pauseAnimation pause = new pauseAnimation();
        pauseButton.setOnAction(pause);


        resetButton = new Button("Reset");
        resetButton.setLayoutY(405);
        resetButton.setLayoutX(340);
        resetAnimation reset = new resetAnimation();
        resetButton.setOnAction(reset);

        background = new Rectangle(0, 0, 400, 400);
        background.setFill(Color.BLACK);
        background.setOnMouseClicked(new missedBallClickEventHandler());

        Hits = new Text("Hits: " + noHits);
        Hits.setLayoutX(10);
        Hits.setLayoutY(30);
        Hits.setFill(Color.WHITE);

        Misses = new Text("Misses: " + noMisses);
        Misses.setLayoutY(30);
        Misses.setLayoutX(70);
        Misses.setFill(Color.WHITE);

        gameOver = new Text("");

        ball = new Ellipse(200, 200, 30, 30);
        ball.setFill(Color.WHITE);
        ball.setOnMouseClicked(new ballClickEventHandler());

        animation = new ballAnimation();
        animation.start();//This will start the animation


        root = new Pane();
        root.getChildren().addAll(background, pauseButton, resetButton, Hits, Misses, gameOver, ball);
        Scene scene = new Scene(root, 400, 435);
        primaryStage.setTitle("Ball Game");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    //The ball give change its colour when clicked and random color would be generated
    private Color randomColor() {
        Random r = new Random();
        return Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }

    //This will look for hits
    private class ballClickEventHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            ball.setFill(randomColor());
            noHits++;
            ball.setCenterX(5);
            xVelocity++;
//            ball.setCenterX(x+xVelocity);
            Hits.setText("Hits: " + noHits);
            Hits.setFont(Font.font(20));
            Misses.setFont(Font.font(13));


        }
    }

    //This method will handle misses
    private class missedBallClickEventHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            noMisses++;
            Misses.setText("Misses: " + noMisses);
            Hits.setFont(Font.font(13));
            Misses.setFont(Font.font(20));
            e.consume();

            if (noMisses >= 5) {
                animation.stop();
                root.getChildren().remove(ball);
//                root.getChildren().add(gameOver);
                root.getChildren().contains(gameOver);
                gameOver.setText("Game Over");
                gameOver.setFill(Color.WHITE);
                gameOver.setFont(Font.font(50));
                gameOver.setUnderline(true);
                gameOver.setLayoutX(50);
                gameOver.setLayoutY(260);

            }
        }
    }


    //The inner class that extends the AnimationTimer class.This makes the ball to make.
    private class ballAnimation extends AnimationTimer {
        @Override
        public void handle(long arg0) {
            double x = ball.getCenterX();
            double y = ball.getCenterX();
            //To get the ball moving from left to right
            if (x + xVelocity > 430 ) {
                x = 5;

            }
            x += xVelocity; //This will help to move the ball in horizontal direction
            ball.setCenterX(x);


        }

    }

    private class pauseAnimation implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            if (pause) {
                animation.stop();
                root.disableProperty();
                pause = false;
            } else {
                animation.start();
                pause = true;
            }
        }
    }
    private class resetAnimation implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            animation.stop();
            noHits=0;
            Hits.setText("Hits: "+ noHits );
            noMisses = 0;
            Misses.setText("Misses: " + noMisses);
            root.getChildren().remove(gameOver);
            ball.setCenterX(10);
            ball.setFill(Color.WHITE);
            root.getChildren().add(ball);
            if(noMisses ==5){
                root.getChildren().add(gameOver);
            }
            animation.start();

        }


    }
}
