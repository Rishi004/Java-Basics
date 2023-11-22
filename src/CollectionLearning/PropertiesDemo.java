package CollectionLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        HashMap hashMap = new HashMap();
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("src/CollectionLearning/test.properties");
        properties.load(fis);
        System.out.println(properties);

        System.out.println(properties.getProperty("dosai"));
        properties.setProperty("dosai", "25");
        System.out.println(properties.getProperty("dosai"));

        FileOutputStream fos = new FileOutputStream("src/CollectionLearning/test.properties");
        properties.store(fos, "Updated");
    }
}
