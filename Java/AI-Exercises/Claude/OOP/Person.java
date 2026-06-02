package OOP;

/* Create a class called Person with:
    Fields: name (String), age (int)
    A constructor that takes both
    A method introduce() that prints "Hi, I am [name] and I am [age] years old."
    In main, create two different Person objects and call introduce() on both. */

public class Person { //Create a class called Person

    //Fields (attributes)
    private final String name; //Encapsulation
    private final int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method
    public void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old." );
    }

    static void main(String[] args) {
        Person p1 = new Person("Debaroti", 19);
        p1.introduce();
        Person p2 = new Person("Bob", 12);
        p2.introduce();
    }
}