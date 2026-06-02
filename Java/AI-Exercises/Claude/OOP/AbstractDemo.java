package OOP;

public class AbstractDemo {

    static void main(String[] args) {

        //Could see the function of Abstract class
        //AbstractAnimal a = new AbstractAnimal("Test");
        // Will give error as abstract cannot be instantiated

        AbstractAnimal[] animals = new AbstractAnimal[2];
        animals[0] = new AbstractDog("Mars");
        animals[1] = new AbstractCat("Dim");

        for (AbstractAnimal animal : animals) {
            System.out.print(animal.getName() + " says: ");
            animal.speak();
        }
    }
}