public class WayToWork {
    public static void main(String[] args) {
        final int WAY_HOMETOWORK = 10;
        float AvarageSpeed = 45.6f;

        float TimeToOffice = WAY_HOMETOWORK/AvarageSpeed;
        System.out.println("Время до работы"  + TimeToOffice);

        float slowdown = 0.7f;
        float TimeToHome = TimeToOffice*slowdown;
        System.out.println("Время до дома"  + TimeToHome);
    }
}
