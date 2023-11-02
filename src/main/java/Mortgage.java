public class Mortgage {
    public static void main(String[] args) {
        final int costApartement = 3900000; //стоимость жилья
        double downPaymentPercentage = 15.5; //процентная ставка, не постоянная, может изменяться ЦБРФ

        double downPayment = costApartement/100*downPaymentPercentage;
        System.out.println(downPayment);
    }
}
