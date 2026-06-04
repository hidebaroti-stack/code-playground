void main() {

    Scanner scanner = new Scanner(System.in);

    //Input for Principal
    System.out.print("Principal: ");
    long userPrincipal = scanner.nextLong();

    //Constants
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    //Input for Annual Interest Rate
    System.out.print("Annual Interest Rate: ");
    float userAnnualInterestRate = scanner.nextFloat();
    float userMonthlyInterestRate = userAnnualInterestRate / PERCENT / MONTHS_IN_YEAR;

    //Input for Period (Years)
    System.out.print("Period (Years): ");
    short userPeriodinYears = scanner.nextShort();
    int numberOfPayments = userPeriodinYears * MONTHS_IN_YEAR;

    //Calculation
    double Mortgage = userPrincipal * (userMonthlyInterestRate * (Math.pow(1 + userMonthlyInterestRate, numberOfPayments)))/((Math.pow(1 + userMonthlyInterestRate, numberOfPayments)) - 1);

    //Formating Mortgage
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);

}