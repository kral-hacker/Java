package InputReading;

public class Console {
    //This console does not run in Ides's

    /**
     * <h1>Console</h1>
     * @author Ananay
     * @param args
     * @since 2023-02-12
     */
    public static void main(String[] args) {
        java.io.Console c = System.console();
        String name=c.readLine();
        System.out.println("You enetered string"+name);
    }
}
