package additional.runnable;

public class Bird implements Runnable {
    public void run() {

        System.out.println("Птичка беги!");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.run();
    }
}