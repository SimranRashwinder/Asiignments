/**This class inherits from Animal
 * It contains type of the snake and poisonous as its instance variables
 * It used super() to get the constructor from animal and return the toString of the animal as well
 */
public class Snake extends Animal   {
    private String snakeType;
    private boolean poisonous;

    public Snake(double weight, AnimalMovement movement, AnimalClass animalClass, String snakeType, Boolean poisonous){
        super(weight,movement, animalClass);
        this.snakeType = snakeType;
        this.poisonous = poisonous;

    }
    public String getSnakeType(){
        return snakeType;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public String toString(){
        return super.toString() + "[SnakeType: " + snakeType + ", isPoisonous: " + poisonous +"]";
    }
}
