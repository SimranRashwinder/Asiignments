/**This is lab submitted by
 * Name: Simran
 * Course: CPSC 1181
 * In this, I have an abstract animal class which contains enums to determine the movement and class of the animal and the animal and toString method
 *
 */
public abstract class Animal {
    public enum AnimalMovement {
        WALK, SWIM, CRAWL, FLY
    }

    public enum AnimalClass {
        MAMMAL, REPTILE, BIRD, INSECT
    }

    private double weight;
    private AnimalMovement movement;
    private AnimalClass animalClass;

    public Animal(double weight, AnimalMovement movement, AnimalClass animalclass) {
        this.weight = weight;
        this.animalClass = animalclass;
        this.movement = movement;
    }
    // It returns the weight of animal
    public double getWeight() {
        return weight;
    }
    //It returns the movement type of the animal
    public AnimalMovement howTheyMove(){
        return movement;
    }

    public AnimalClass getAnimalClass() {
        return animalClass;
    }
    public String toString(){
        return "\n" + getClass().getName() + "[Weight: " + weight + ", movement: " + movement + ", Animal class: " + animalClass +"] ";
    }
}
