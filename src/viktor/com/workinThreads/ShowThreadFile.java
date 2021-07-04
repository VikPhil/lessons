package viktor.com.workinThreads;

public class ShowThreadFile {
    public static void output() throws InterruptedException {
        ThreadArrayFile [] arrayThread = new ThreadArrayFile[5];

        for (int i = 0; i < arrayThread.length; i++) {
            arrayThread[i] = new ThreadArrayFile();
            arrayThread[i].start();
            arrayThread[i].join();
        }
    }
}
