package lab_10;

public class TestTriple {
    public static void main(String[] args) {
        Triple<Integer> triple = new Triple<>(1, 6, 3);
        triple.print();
        System.out.println("Минимальное значение тройки: " + triple.min() + "\nМаксимальное значение тройки: " +
                triple.max() + "\nСреднее значение тройки: " + triple.mean());
    }
}
