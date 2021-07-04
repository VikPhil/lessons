package viktor.com.workinThreads;

public class ShowThread {
    public static void output() throws InterruptedException {

        ArithmeticThread [] arrayThread = new ArithmeticThread [10];

        for (int i = 0; i < arrayThread.length; i++) {
            arrayThread[i] = new ArithmeticThread();
            arrayThread[i].start();
            arrayThread[i].join();
        }
    }
}
