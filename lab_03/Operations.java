package lab_03;

public class Operations {
    public static void main(String[] args) {

        // Логические операции && || !
        boolean a = false;
        boolean b = true;

        // && - конъюнкция, логическое умножение
        System.out.printf("Для a = %s и и b = %s: a && b = %s", a, b, a && b);

        // || - дизъюнкция, логическое сложение
        System.out.printf("\nДля a = %s и и b = %s: a || b = %s", a, b, a || b);

        // ! - инверсия, отрицание
        System.out.printf("\nДля a = %s: !a = %s \n", a, !a);

        // Тернарная операция x < y ? x : y
        int x = 4;
        int y = 6;
        System.out.printf("\nВывод тернарной операции x < y ? x : y при x = %d и y = %d: %d\n", x, y, x < y ? x : y);

        // Поразрядные логические операции & | ^ ~

        int num1 = 5; // 0101 в двоичной системе
        int num2 = 3; // 0011 в двоичной системе

        // & - поразрядное И
        int c = num1 & num2; // 0001 в двоичной системе
        System.out.printf("\nПри num1 = %d и num2 = %d: num1 & num2 = %d", num1, num2, c);

        // | - поразрядное ИЛИ
        int d = num1 | num2; // 0111 в двоичной системе
        System.out.printf("\nПри num1 = %d и num2 = %d: num1 | num2 = %d", num1, num2, d);

        // ^ - Поразрядное исключающее ИЛИ
        int e = num1 ^ num2; // 0110 в двоичной системе
        System.out.printf("\nПри num1 = %d и num2 = %d: num1 ^ num2 = %d", num1, num2, e);

        // ~ - Поразрядное отрицание
        int f = ~num1; // 11111111111111111111111111111010 в двоичной системе
        System.out.printf("\nПри num1 = %d: ~num1 = %d\n", num1, f);

        // операции сдвига >> << >>>
        int num3 = -1; // 11111111111111111111111111111111 в двоичной системе

        // >> - cдвиг вправо
        int g = num3 >> 1; // 1111111111111111111111111111111 в двоичной системе
        System.out.printf("\nПри num3 = %d: num1 >> 1 = %d", num3, g);

        // << - cдвиг влево
        int h = num3 << 1; // 11111111111111111111111111111110 в двоичной системе
        System.out.printf("\nПри num3 = %d: num1 << 1 = %d", num3, h);

        // >>> - cдвиг вправо с заполнением нулями
        int j = num3 >>> 1; // 01111111111111111111111111111111 в двоичной системе
        System.out.printf("\nПри num3 = %d: num1 >>> 1 = %d", num3, j);
    }
}
