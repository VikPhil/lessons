package viktor.com.lesson2;

public class CycleDemo {

    //Home work number 12
    public static int factorial(int number) {

        int i = 1;
        int fact = 1;

        while(i <= number) {
            fact *= i++;
        }
        return fact;

    }
    //////////////////////////////////////////////////////////

    //Home work number 13
    public static long multiplier() {

        long product = 1;
        int number = 1;

        do {
            product *= number++;
        } while(number <= 25);

      return product;

    }
    //////////////////////////////////////////////////////////////////

    //Home work number 14
    public static long sumOfNumbers() {

        long number = 7893823445l;
        long sum = 0;
        int count = 0;

        do {
            sum += number % 10;
            number /= 10;
            count++;
        }while(count <= 10);

        return sum;
    }
    /////////////////////////////////////////////////////////////////////

    //Home work number 15
    public static void primeNumber() {

        int counter = 0;

        for(int i = 50; i <= 70; i++) {
            boolean prime = true;
            for (int j = 2; j <= 10; j++) {
                if(i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                counter++;
                if (counter == 2) {
                    System.out.println(i);
                }
            }
        }

    }
    ////////////////////////////////////////////////////////////////////

    //Home work number 16
    public static void isHope() {

        for(int i = 1; i <= 100; ++i) {
            if(i % 7 == 0 ) {
                System.out.println("Hope!");
            }
        }
    }
    /////////////////////////////////////////////////////////////////////

    //home work number 17
    public static void formatNumber(long number) {

        long digit;

        do {
            digit = number % 1000;
            System.out.println(digit);
            number /= 1000;

        }while(number % 1000 != 0);

    }
}
