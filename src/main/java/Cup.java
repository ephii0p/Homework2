public class Cup {
    private static int ML_CUP = 200; //объем кружки в мл
    private static double PRECENT = 35.6; //процент заполнения
    public static void main(String[] args) {

        double fillPercentage = ML_CUP / 100 * PRECENT;
        System.out.println(fillPercentage);
    }
}
