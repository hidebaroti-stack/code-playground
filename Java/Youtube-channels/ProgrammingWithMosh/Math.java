public class Math {
    public static void main(String[] args) {
        int rounded = (int)Math.round(1.4F);
        System.out.println(rounded);

        int ceiling = (int)Math.ceil(1.2F);
        System.out.println(ceiling);

        int flooring = (int)Math.floor(1.9F);
        System.out.println(flooring);

        int max = (int)Math.max(5, 2);
        System.out.println(max);

        double random = Math.random();
        System.out.println(random);
        int randomInt = (int)(Math.random() * 100);
        System.out.println(randomInt);
    }
}