public class String {
    public static void main(String[] args) {

        String message = "  Hello World!!";

        System.out.println(message);
        System.out.println(message.startsWith("!!"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("s"));
        System.out.println(message.replace("!", "&"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

        String message2 = "Hello \"Deb\" ";
        System.out.println(message2);
        String message3 = "c:\\Windows\\...";
        System.out.println(message3);
        String message4 = "\nDeb Nath\tDDN";
        System.out.println(message4);

    }
}