package GarbageCollection;

public class GarbageCollectionDemo {
    private static GarbageCollectionDemo garbageCollectionDemo = new GarbageCollectionDemo();

    public static GarbageCollectionDemo getGarbageCollectionDemo() {
        return garbageCollectionDemo;
    }

    private GarbageCollectionDemo() {
    }

    public void display() {
        System.out.println("Singleton class");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo gcd = GarbageCollectionDemo.getGarbageCollectionDemo();

        GarbageCollectionDemo GCD1 = new GarbageCollectionDemo();
        GarbageCollectionDemo GCD2 = new GarbageCollectionDemo();
        GarbageCollectionDemo GCD3 = new GarbageCollectionDemo();

        Runtime rt = Runtime.getRuntime();
        Runtime.getRuntime().gc();
        System.gc();

        System.out.println("Free Memory: " + rt.freeMemory() / (1024 * 1024) + " MB");
        System.out.println("Total Memory: " + rt.totalMemory() / (1024 * 1024) + " MB");

    }
}
