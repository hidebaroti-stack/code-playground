package OOP;

public class AbstractDog extends AbstractAnimal{

    //constructor
    public AbstractDog(String name) {
        super(name);
    }
    //Override the method
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
