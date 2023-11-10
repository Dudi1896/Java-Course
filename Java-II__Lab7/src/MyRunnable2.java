public class MyRunnable2 implements Runnable {
    private final int loopCount;

    public MyRunnable2(int loopCount) {
        this.loopCount = loopCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < loopCount; i++) {
            System.out.println("Thread Running..." + loopCount );
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable(250);
        MyRunnable runnable2 = new MyRunnable(300);
        MyRunnable runnable3 = new MyRunnable(200);
        MyRunnable runnable4 = new MyRunnable(350);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        Thread thread4 = new Thread(runnable4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
