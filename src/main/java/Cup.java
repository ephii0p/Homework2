public class Cup {
    public static void main(String[] args) {
        final int mlCup = 200; //объем кружки в мл
        double precent = 35.6; //процент заполнения

        double fillPercentage = mlCup / 100 * precent;
        System.out.println(fillPercentage);
    }
}
