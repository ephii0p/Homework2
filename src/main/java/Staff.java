public class Staff {
    public static void main(String[] args) {
        final byte PROGRAMMER = 24;
        final byte QA = 3;
        final byte SUPPORT = 5;

        int sumQA = PROGRAMMER * QA;
        System.out.println("Количество тестировщиков" + sumQA);

        int sumSupport = PROGRAMMER * SUPPORT;
        System.out.println("Количество специлаистов поддержки" + sumSupport);

        int staff = sumSupport + sumQA + PROGRAMMER;
        System.out.println("Количество технического персонала" + staff);
    }
}
