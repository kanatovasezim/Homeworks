public class Add extends Thread2 {
    @Override
    public void run() {
        System.out.println("Addition: " + (getX()+2));
    }
}
