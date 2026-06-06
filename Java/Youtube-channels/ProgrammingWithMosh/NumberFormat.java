import java.util.Locale;

public class NumberFormat {
    public static void main(String[] args) {
        java.text.NumberFormat currency = java.text.NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(1234567.834));

        java.text.NumberFormat percent = java.text.NumberFormat.getPercentInstance();
        System.out.println(percent.format(0.01));

        java.text.NumberFormat bdCurrency = java.text.NumberFormat.getCurrencyInstance(new Locale("bn", "BD"));
        System.out.println(bdCurrency.format(1234567.834));
    }
}