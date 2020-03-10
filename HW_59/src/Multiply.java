public class Multiply extends Thread2 {
    @Override
    public void run() {
        System.out.println("Multiplication: " + getX()*2);
    }
}
