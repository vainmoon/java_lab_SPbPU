package lab_04;

public class TypesOfSwitch {
    public static void main(String[] args) {
        byteSwitch((byte) 3);
        shortSwitch((short) 130);
        charSwitch('f');
        intSwitch(32768);
        enumSwitch(DayOfWeek.SUNDAY);
        stringSwitch("world");
    }

    public enum DayOfWeek {

        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void byteSwitch(byte value) {
        switch (value) {
            case 2:
                System.out.println("Значение переменной типа byte = 2");
                break;
            case 3:
                System.out.println("Значение переменной типа byte = 3");
                break;
            default:
                System.out.println("В switch нету case с таким значением переменной типа byte");
                break;
        }
    }

    public static void shortSwitch(short value) {
        switch (value) {
            case 576:
                System.out.println("Значение переменной типа short = 576");
                break;
            case 231:
                System.out.println("Значение переменной типа short = 231");
                break;
            default:
                System.out.println("В switch нету case с таким значением переменной типа short");
                break;
        }
    }

    public static void charSwitch(char value) {
        switch (value) {
            case 'f':
                System.out.println("Значение переменной типа char = f");
                break;
            case 'a':
                System.out.println("Значение переменной типа char = a");
                break;
            default:
                System.out.println("В switch нету case с таким значением переменной типа char");
                break;
        }
    }

    public static void intSwitch(int value) {
        switch (value) {
            case 32768:
                System.out.println("Значение переменной типа int = 32768");
                break;
            case 4124124:
                System.out.println("Значение переменной типа int = 4124124");
                break;
            default:
                System.out.println("В switch нету case с таким значением переменной типа int");
                break;
        }
    }

    public static void enumSwitch(DayOfWeek value) {
        switch (value) {
            case MONDAY:
                System.out.println("Сегодня понедельник");
                break;
            case THURSDAY:
                System.out.println("Сегодня четверг");
                break;
            default:
                System.out.println("Сегодня ни четверг, ни понедельник");
                break;
        }
    }

    public static void stringSwitch(String value) {
        switch (value) {
            case "hello":
                System.out.println("Привет!");
                break;
            case "world":
                System.out.println("Мир");
                break;
            default:
                System.out.println("Перевод слова не известен");
                break;
        }
    }
}
