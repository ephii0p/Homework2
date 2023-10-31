package taskadditional.runnable;

public class Dog implements Runnable {
    public void run() {
        System.out.println("Собачка беги!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
    }
}
