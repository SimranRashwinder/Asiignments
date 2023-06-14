
public class Tree extends Application{

    /**Lab6 submitted by Simran(SID:100377444)
     * In this I used the code provided in the lecture slides to draw the tree and the ground and after that I added arainbow at the top using ellipse and for loop
     */
        @Override
        public void start(Stage primaryStage){
            Pane root = new Pane();
            primaryStage.setResizable(false);
            Color[] colors = {Color.WHITE,Color.PURPLE,Color.INDIGO,Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};

            for (int i = 0; i <colors.length ; i++) {
                Ellipse rainbow = new Ellipse(150,300,200+7*i, 200+7*i);
                rainbow.setFill(Color.TRANSPARENT);
                rainbow.setStroke(colors[i]);
                rainbow.setStrokeWidth(7);
                root.getChildren().add(rainbow);
            }

            Rectangle ground = new Rectangle(0,300,300,100);
            ground.setFill(Color.DARKGREEN);
            Rectangle trunk = new Rectangle(140,220,20,100);
            trunk.setFill(Color.SADDLEBROWN);
            Ellipse leaves = new Ellipse(150,220,40,50);
            leaves.setFill(Color.rgb(30,120,80));

            root.getChildren().addAll(ground,trunk,leaves);
            Scene scene = new Scene(root,300,400);
            primaryStage.setTitle("FX Shapes");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        public static void main(String[] args){
            launch(args);

        }
    }
}
