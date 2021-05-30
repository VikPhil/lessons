package viktor.com.lessonArrays;

//Home work number 19
public class ArrayEvenPosition {
    public static void evenPositions(int [] arrayNumbers) {

        for (int i = 0; i < arrayNumbers.length; i++) {

            System.out.println( "Position[" + i + "] " + arrayNumbers[i] + " ");

        }
        for (int j = 0; j < arrayNumbers.length; j+=2) {
            if(j == 0) {
                continue;
            }
            System.out.print(arrayNumbers[j] + " ");
        }
    }
}
