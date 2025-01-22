package SystemExamples;

import java.io.FileInputStream;
import java.util.Properties;

public class AssignSystemProperties {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("src/SystemExamples/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(file);
            p.setProperty("my.personalized.property","My stored value in properties object");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty = " + ps.getProperty("my.personalized.property"));
            System.out.println(System.getProperty("config.port.server"));
            System.out.println(System.getProperty("config.author.name"));
            System.out.println(System.getProperty("config.author.email"));

            ps.list(System.out);
        } catch (Exception e) {
            System.out.println("The file doesn't exist = " + e);
        }
    }
}
