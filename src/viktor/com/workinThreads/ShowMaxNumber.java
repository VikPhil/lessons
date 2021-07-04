package viktor.com.workinThreads;

public class ShowMaxNumber {
    public static void output() throws InterruptedException {

        ThreadMaxNumber [] arrayThread = new ThreadMaxNumber[10];

        for (int i = 0; i < arrayThread.length; i++) {
            arrayThread[i] = new ThreadMaxNumber();
            arrayThread[i].start();
            arrayThread[i].join();
        }
    }
}
