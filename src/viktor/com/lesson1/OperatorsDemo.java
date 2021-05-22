package viktor.com.lesson1;

public class OperatorsDemo {

    //Home work number 6
    public static boolean isSeven(int number) {

        return (number % 10) == 7;

    }
    //////////////////////////////////////////////

    //Home work number 7
    public static void isResult() {

        int width = 9;
        int length = 3;
        int radius = 5;

        if(4 * (int)Math.pow( radius, 2) >= (int)Math.pow(width, 2) + (int)Math.pow(length, 2)) {
            System.out.println("Этот прямоугольник можно закрыть круглой картонкой.");
        } else
        {
            System.out.println("Круглая картонка слишком мала.");
        }

    }
    ////////////////////////////////////////////////////////////

    //Home work number 8
    public static void money(int sum) {

        if(sum % 10 == 1 && sum % 100 != 11) {
            System.out.println(sum + " рубль");
        } else if (sum % 10 > 1 && sum % 10 <= 4) {
            if (sum % 100 > 11 && sum % 100 <= 19) {
                System.out.println(sum + " рублей");
            } else {
                System.out.println(sum + " рубля");
            }
        } else
        {
            System.out.println(sum + " рублей");
        }

    }
    ////////////////////////////////////////////////////////////

    //Home work number 9
   public static void isCalendar(int day, int month, int year) {

            if (day <= 30 && month <= 3 ) {
                ++day;
                if (day == 31 && month == 1) {
                    day = 1;
                    ++month;
                }
                System.out.println(day + " " + month + " " + year);
            } else if (day == 30 && month == 1) {
                day = ++day - 30;
                ++month;
                System.out.println(day + " " + month + " " + year);
            } else if (day >= 31 && month == 3) {
                day = ++day - 31;
                month = 1;
                ++year;
                System.out.println(day + " " + month + " " + year);
            } else if (day >= 31 && month == 2) {
                day = ++day - 31;
                ++month;
                System.out.println(day + " " + month + " " + year);
            }
   }
   /////////////////////////////////////////////////////////////////////

    //Home work number 10
    public static void twoHouse() {

        int widthOne = 10;
        int lengthOne = 20;
        int widthTwo = 10;
        int lengthTwo = 10;

        int widthSurface = 10;
        int lengthSurface = 30;

        int areaHouse = widthOne * lengthTwo + widthTwo * lengthTwo;

        if (areaHouse <= widthSurface * lengthSurface) {
            System.out.println("Дома с такими габаритами помещаются на поверхности " + widthSurface + " на " + lengthSurface );
        } else
        {
            System.out.println("Эти дома не смогут поместиться.");
        }
    }
   /////////////////////////////////////////////////////////////////////

    //Home work number 11;
    public static void timetable(int day) {

        switch (day) {
            case 1:
                System.out.println("Понедельник. Сходить на учебу.");
                break;
            case 2:
                System.out.println("Вторник. Основная работа.");
                break;
            case 3:
                System.out.println("Среда. Посетить занятия.");
                break;
            case 4:
                System.out.println("Четверк. Прогулка в парке.");
                break;
            case 5:
                System.out.println("Пятница. Посетить поликлиннику.");
                break;
            case 6:
                System.out.println("Суббота. Сделать домашнюю работу.");
                break;
            case 7:
                System.out.println("Воскресенье. Отдых.");
                break;
            default:
                System.out.println("Ошибка!!! Введите число в диапазоне от 1 до 7");
        }

    }
}
