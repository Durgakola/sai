import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {

        try {
            String envValue = System.getProperty("env");
            System.out.println(envValue.toUpperCase());
            System.out.println("System  " + System.getProperty("env"));

            System.out.println("hello world");
        }
        catch (Exception e){
            System.out.println("from caatch block " +e.getMessage());
        }

        finally {
            System.out.println("finally executed");
        }
    }
}
