package viktor.com.lessonArrays;

//Home work number 19
public class ArrayEvenPosition {
    public static void evenPositions() {

        int arrayNumbers[] = {28, 13, 47, 2, 10, 44, 100, 7, 25, 54};

        for (int i = 0; i < arrayNumbers.length; i++) {

            System.out.println( "Позиция[" + i + "] " + arrayNumbers[i] + " ");

        }
        System.out.println();
        for (int j = 0; j < arrayNumbers.length; j+=2) {
            if(j == 0) {
                continue;
            }
            System.out.print(arrayNumbers[j] + " ");
        }
    }
}
