public class Main {
    public static void main(String[] args) {
        Thread multiply = new Thread(new Multiply());
        Thread divide = new Thread(new Divide());
        Thread subtract = new Thread(new Subtract());
        Thread add = new Thread(new Add());
        multiply.start();
        divide.start();
        subtract.start();
        add.start();
    }
}
