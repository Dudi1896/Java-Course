public class MyThread extends Thread {
    private final int loopCount;

    public MyThread(int loopCount) {
        this.loopCount = loopCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < loopCount; i++) {
            System.out.println("Thread Running..." + loopCount);
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread(250);
        MyThread thread2 = new MyThread(300);

        thread1.start();
        thread2.start();
    }
}
