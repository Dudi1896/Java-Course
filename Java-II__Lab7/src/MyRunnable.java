public class MyRunnable implements Runnable {
    private final int loopCount;

    public MyRunnable(int loopCount) {
        this.loopCount = loopCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < loopCount; i++) {
            System.out.println("Thread Running..." + loopCount);
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable(250);
        MyRunnable runnable2 = new MyRunnable(300);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
