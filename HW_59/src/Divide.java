public class Divide extends Thread2 {
    @Override
    public void run() {
        System.out.println("Division: "  + getX()/2);
    }
}
