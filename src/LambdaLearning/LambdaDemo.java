package LambdaLearning;

public class LambdaDemo {
    public static void main(String[] args) {
        FunctionalInterface1 fi1 = () -> System.out.println("Test");
        fi1.test();
        fi1.test2();
        FunctionalInterface1.test3();

        FunctionalInterface2 fi2 = (int num1, int num2) -> num1 + num2;

        System.out.println(fi2.add(15, 25));
    }
}
