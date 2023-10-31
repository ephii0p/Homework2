public class Mortgage {
    public static void main(String[] args) {
        final int COST_APARTEMENT = 3900000;
        double downPaymentPercentage = 15.5;

        double downPayment = COST_APARTEMENT/100*downPaymentPercentage;
        System.out.println(downPayment);
    }
}
