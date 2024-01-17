package programmer.data;

public class Application {
    public static final int PROCESSORS;

    static {
        System.out.println("Akses class application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
