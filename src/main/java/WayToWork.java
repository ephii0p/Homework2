public class WayToWork {
    public static void main(String[] args) {
        int WayHomeToWork = 10;
        float AvarageSpeed = 45.6f;
        float TimeToOffice = WayHomeToWork/AvarageSpeed;
        System.out.println("Время до работы"  + TimeToOffice);
        float slowdown = 0.7f;
        float TimeToHome = TimeToOffice*slowdown;
        System.out.println("Время до дома"  + TimeToHome);
    }
}
