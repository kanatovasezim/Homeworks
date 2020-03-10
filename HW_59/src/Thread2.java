public class Thread2 implements Runnable{
    private static Integer x = 2;


    public static Integer getX() {
        return x;
    }

    public static void setX(Integer x) {
        Thread2.x = x;
    }

    @Override
    public void run() {

    }
}
