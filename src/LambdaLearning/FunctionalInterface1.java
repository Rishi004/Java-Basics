package LambdaLearning;

public interface FunctionalInterface1 {
    public abstract void test();

    default void test2() {
        System.out.println("Default Method");
    }

    static void test3() {
        System.out.println("Static Method");
    }
}
