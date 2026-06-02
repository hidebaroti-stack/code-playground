package OOP;

import java.util.Scanner;

public class Animal {

    //Field(attributes)
    String name;

    //Constructor
    public Animal(String name){
        this.name = name;
    }
    //Getter for name
    public String getName() {
        return name;
    }

    //Method
    public void speak() {
        System.out.println("Some animal sound.");
    }

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Dog name: ");
        String dogName = scanner.nextLine();

        Dog dog = new Dog(dogName);
        System.out.print( "Dog's name: " + dog.getName() + " and Sounds ");
        dog.speak();

        System.out.print("Enter the Cat name: ");
        String catName = scanner.nextLine();

        Cat cat = new Cat(catName);
        System.out.print("Cat's name: " + cat.getName() + " and Sounds ");
        cat.speak();

    }

}
