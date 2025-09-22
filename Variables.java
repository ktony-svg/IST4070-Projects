class Variables {

    void showInterest() {
        double amount;
        double interest; // percentage

        amount = 1200.00;
        System.out.println("amount: " + amount);

        interest = 3.0; // The interest rate is 3%

        // Calculate amount after 1 year
        amount = amount * (1 + interest / 100);
        System.out.println("after a year: " + amount);

        // Calculate amount after 2 years
        amount = amount * (1 + interest / 100);
        System.out.println("after 2 years: " + amount);
    }

    public static void main(String[] args) {
        (new Variables()).showInterest();
    }
}