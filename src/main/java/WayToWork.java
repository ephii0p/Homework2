public class WayToWork {
    public static void main(String[] args) {
        final int wayHomeToWork = 10; // расстояние не изменимо
        float AvarageSpeed = 45.6f; //средняя скорость может изменяться изо дня в день

        float TimeToOffice = wayHomeToWork/AvarageSpeed;
        System.out.println("Время до работы"  + TimeToOffice);

        float slowdown = 0.7f; // коэфициент может изменяться изо дня в день
        float TimeToHome = TimeToOffice*slowdown;
        System.out.println("Время до дома"  + TimeToHome);
    }
}
