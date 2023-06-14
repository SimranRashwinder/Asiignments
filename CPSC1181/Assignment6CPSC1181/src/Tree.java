/**This class extends the Scenery class and creates the 3 trees which are needed to be shown in the window
 * I used two constructors here to make 3 trees
 */

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class Tree {
    private Rectangle trunk;// rectangle shape is used to make the trunk of the tree
    private Ellipse leaves;// Ellipse is used to create the leaves
    private Rectangle box;// box shows the x, y positions which is the little box created below each tree trunk on ground

    //This constructor creates the first tree
    public Tree(int x, int y){

        trunk = new Rectangle(x-10, y -100, 20, 100);
        trunk.setFill(Color.SADDLEBROWN);
        box = new Rectangle(x, y, 5, 5);

        leaves = new Ellipse(x, y-100, 40, 60);
        leaves.setFill(Color.rgb(30, 120, 80));
    }
    //This constructor modifies the height, width and color to create another trees
    public Tree(int x,int y,int width,int height, Color color)
    {
        trunk = new Rectangle(x-10, y -height/2, 15, height/2);
        trunk.setFill(Color.SADDLEBROWN);
        box = new Rectangle(x, y, 5, 5);

        leaves = new Ellipse(x, y-height*0.7, width/3, height/3);
        leaves.setFill(color);

    }
    //this method adds all the nodes that is different parts of the tree together
    public Node[] getAllNodes(){
        return new Node[] {trunk, leaves, box};
    }
}
