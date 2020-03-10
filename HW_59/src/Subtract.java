public class Subtract extends Thread2 {
    @Override
    public void run() {
        System.out.println("Subtraction: " + (getX()-2));
    }
}
