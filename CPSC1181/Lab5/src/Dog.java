/**This class inherits from Animal
 * It contains the breed of the dog as instance variable
 * It used super() to get the constructor from animal and return the toString of the animal as well
 */
public class Dog extends Animal {
    private String breed;

    public Dog(double weight, AnimalMovement movement, AnimalClass animalClass, String breed){
        super(weight,movement, animalClass);
        this.breed = breed;
    }
    public  String getBreed(){
        return breed;
    }

    public String toString(){
        return super.toString() + "[Breed: " + breed +"]";
    }

}
