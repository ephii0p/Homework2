public class Staff {
    public static void main(String[] args) {
        final byte programmer = 24;
        final byte qa = 3;
        final byte support = 5;

        int sumQA = programmer * qa;
        System.out.println("Количество тестировщиков" + sumQA);

        int sumSupport = programmer * support;
        System.out.println("Количество специлаистов поддержки" + sumSupport);

        int staff = sumSupport + sumQA + programmer;
        System.out.println("Количество технического персонала" + staff);
    }
}
