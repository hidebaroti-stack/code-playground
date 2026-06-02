package OOP;

public class Polymorphism {

    static void main(String[] args) {

        //Create an array of Animal references
        //Each element can hold an Animal or any subclass (Dog, Cat)
        Animal[] animals = new Animal[3];

        //Store different types of objects in the same array
        animals[0] = new Dog("Mars");         //Dog object
        animals[1] = new Cat("Dim");          //Cat object
        animals[2] = new Animal("Unknown");   //Base Animal object

        //Loop through the array
        for (Animal animal : animals) {
            //Print the name of the animal
            System.out.print(animal.getName() + " says: ");

            animal.speak();
            //Polymorphism: the actual method executed depends on the objects type
        }
    }
}