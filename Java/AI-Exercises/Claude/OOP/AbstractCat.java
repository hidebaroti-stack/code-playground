package OOP;

public class AbstractCat extends AbstractAnimal{

    //constructor
    public AbstractCat(String name) {
      super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
