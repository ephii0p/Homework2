public class Mortgage {
    private static final int COST_APARTEMENT = 3900000; //стоимость жилья
    private static double DOWN_PAYMENT_PERSENTAGE = 15.5; //процентная ставка, не постоянная, может изменяться ЦБРФ

    public static void main(String[] args) {

        double downPayment = COST_APARTEMENT / 100*DOWN_PAYMENT_PERSENTAGE;
        System.out.println(downPayment);
    }
}
