public class Staff {
    public static final byte PROGRAMMER = 24;
    public static final byte QA = 3;
    public static final byte SUPPORT = 5;
    public static void main(String[] args) {

        int sumQA = PROGRAMMER * QA;
        System.out.println("Количество тестировщиков" + sumQA);

        int sumSupport = PROGRAMMER * SUPPORT;
        System.out.println("Количество специлаистов поддержки" + sumSupport);

        int staff = sumSupport + sumQA + PROGRAMMER;
        System.out.println("Количество технического персонала" + staff);
    }
}
