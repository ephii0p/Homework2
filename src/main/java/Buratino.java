public class Buratino {
    public static final int BURATINO_APPLES = 10;
    public static final int KARABAS_TAKE_APPLES_AWAY = 4; // карабас забрал
    public static void main(String[] args) {

        long applesLeft = BURATINO_APPLES - KARABAS_TAKE_APPLES_AWAY;
        System.out.println(applesLeft);
    }
}

