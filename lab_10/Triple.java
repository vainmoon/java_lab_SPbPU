package lab_10;

public class Triple<T extends Number & Comparable<T>> {

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T min() {
        if (first.compareTo(second) <= 0 && first.compareTo(third) <= 0) {
            return first;
        } else if (second.compareTo(first) <= 0 && second.compareTo(third) <= 0) {
            return second;
        } else {
            return third;
        }
    }

    public T max() {
        if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
            return first;
        } else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
            return second;
        } else {
            return third;
        }
    }

    public double mean() {
        return (first.doubleValue() + second.doubleValue() + third.doubleValue()) / 3;
    }

    public void print() {
        System.out.println("Triple {" + "first = " + first + ", second = " + second + ", third = " + third + '}');
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }

    private T first;

    private T second;

    private T third;

}
