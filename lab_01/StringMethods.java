package lab_01;

public class StringMethods {
    public static void main(String[] args) {
        // Создание строки:

        // Присвоить напрямую:
        String str1 = "Hello";

        // Воспользоваться конструктором строки:
        String str2 = new String("world!");

        // Метод length() возвращает длину строки:
        System.out.println("Длина первой строки: " + str1.length());

        // Метод isEmpty() позволяет проверить строку на пустоту:
        String emptyString = "";
        System.out.println("Вторая строка пустая? " + str2.isEmpty() + "\nА для пустой строки получим: " + emptyString.isEmpty());

        // Метод concat() объединяет указанную строку с концом другой строки.
        System.out.println("Объедение первой и второй строки: " + str1.concat(str2));

        // Метод valueOf() преобразует объект в строковый вид.
        int number = 412412;
        System.out.println("Возвращаемое значение от int: " + String.valueOf(number));

        // Метод join() соединяет строки с учетом разделителя.
        System.out.println("Соединим первую и вторую строку с разделителем *: " + String.join("*", str1, str2));

        // Метод charAt() возвращает значение char по указанному индексу.
        System.out.println("Первый символ второй строки: " + str2.charAt(0));

        // Метод equals() сравнивает эту строку с другой строкой.
        String tmpStr1 = "good luck!";
        String tmpStr2 = "GOOD LUCK!";
        System.out.println("Сравним строку \"good luck!\" и \"GOOD LUCK!\": " + tmpStr1.equals(tmpStr2));

        // Метод equalsIgnoreCase() сравнивает эту строку с другой строкой, игнорируя регистр.
        System.out.println("Теперь сравним строку \"good luck!\" и \"GOOD LUCK!\" без учета регистра: " + tmpStr1.equalsIgnoreCase(tmpStr2));

        // Метод indexOf() находит индекс первого вхождения подстроки в строку.
        System.out.println("Индекс первого вхождения символа \"l\" в первую строку: " + str1.indexOf("l"));

        // Метод lastIndexOf() находит индекс последнего вхождения подстроки в строку.
        System.out.println("Индекс последнего вхождения символа \"l\" в первую строку: " + str1.lastIndexOf("l"));

        // Метод startsWith() определяет, начинается ли строка с подстроки.
        System.out.println("Первая строка начинается с \"Hel\"? " + str1.startsWith("hel"));

        // Метод endsWith() определяет, заканчивается ли строка на определенную подстроку.
        System.out.println("Вторая строка заканчивается на \"!\"? " + str2.endsWith("!"));

        // Метод replace() заменяет в строке одну подстроку на другую.
        System.out.println("Заменим все символы \"l\" в первой строке на \"qwerty\": " + str1.replace("l", "qwerty"));

        // Метод trim() удаляет начальные и конечные пробелы.
        String strWithSpace = "     hi!    ";
        System.out.println("Удалим пробелы в строке:  \"     hi!    \": " + strWithSpace.trim());

        // Метод substring() возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса.
        System.out.println("Подстрока первой строки начиная с 3 символа:" + str1.substring(2));

        // Метод toLowerCase() переводит все символы строки в нижний регистр.
        System.out.println("Первая строка в нижнем регистре: " + str1.toLowerCase());

        // Метод toUpperCase() переводит все символы строки в верхний регистр.
        System.out.println("Вторая строка в верхнем регистре: " + str2.toUpperCase());
    }
}