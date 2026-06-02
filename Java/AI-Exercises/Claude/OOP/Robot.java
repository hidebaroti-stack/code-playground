package OOP;

//Robot implements both interfaces
public class Robot implements Speakable, Movable {

    @Override
    public void speak() {
        System.out.println("Beep boop!");
    }

    @Override
    public void move() {
        System.out.println("Rolling forward.");
    }
}