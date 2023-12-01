package lab_07;

public class ExchangeClass<T> {
    public static void main(String[] args) {
        ExchangeClass<String> firstClass = new ExchangeClass<>("Hello");
        ExchangeClass<String> secondClass = new ExchangeClass<>("World!");
        System.out.printf("Значения до обмена у первого класса: %s и у второго: %s", firstClass.getData(), secondClass.getData());
        ExchangeClass.exchangeData(firstClass, secondClass);
        System.out.printf("\nЗначения после обмена у первого класса: %s и у второго: %s", firstClass.getData(), secondClass.getData());
    }

    public ExchangeClass(T data) {
        this.data = data;
    }

    public static <E> void exchangeData(ExchangeClass<E> firstClass, ExchangeClass<E> secondClass) {
        E tmp = firstClass.getData();
        firstClass.setData(secondClass.getData());
        secondClass.setData(tmp);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;
}
