package test;

public class Calculator {
    @FunctionalInterface
    public interface BinaryOperator<T> {
        T apply(T x, T y);
    }

    @FunctionalInterface
    public interface UnaryOperator<T> {
        T apply(T x);
    }

    @FunctionalInterface
    public interface Predicate<T> {
        boolean apply(T x);
    }

    @FunctionalInterface
    public interface Supplier<T> {
        Calculator get();
    }

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T x);
    }

    public static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> ((x == 0) || (y == 0)) ? 0 : x / y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
