package lab_08;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ManagerDataClass {
    public static void main(String[] args) {
        String testString = "Hello world!";
        getData(testString);
    }

    public static void getData(Object object) {
        Class<?> clazz = object.getClass();
        System.out.println("Название класса:\n" + clazz);

        System.out.println("\nПоля класса: ");
        for (Field filed : clazz.getDeclaredFields()) {
            System.out.println(filed);
        }

        System.out.println("\nРодительский класс:\n" + clazz.getSuperclass());

        System.out.println("\nМетоды класса: ");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println("\nКонструкторы класса: ");
        for (Constructor constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}
