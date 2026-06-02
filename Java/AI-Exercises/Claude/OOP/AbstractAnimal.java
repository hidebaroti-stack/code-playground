package OOP;

public abstract class AbstractAnimal {

    private String name;

    //Constructor
    public AbstractAnimal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void speak();
}
