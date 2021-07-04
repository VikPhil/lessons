package viktor.com.workinThreads;

/**
 * Home work number 52
 */
public class ArithmeticThread extends Thread {
    public void run() {
        ArithmeticMean.calculation();
    }
}
