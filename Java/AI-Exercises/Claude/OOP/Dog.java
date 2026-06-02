package OOP;

//Inheriting from Parent class Animal
public class Dog extends Animal {

    //Constructor
    public Dog(String name) {
            super(name); //Call Animal constructor
    }
    //Override speak method
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}