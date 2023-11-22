package StaticNonStatic;

public class StaticClass {
    StaticClass() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Non-static block");
    }

    {
        System.out.println("Non-static block 2");
    }

    static {
        System.out.println("Static block");
    }

    static {
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Static class");
        StaticClass obj1 = new StaticClass();
        StaticClass obj2 = new StaticClass();
        StaticClass.staticMethod();
    }

    public static void staticMethod() {
        System.out.println("Static method");
    }
}
