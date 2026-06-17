package errorandexceptionhandlingcwh;

public class trycatchblock {
    /**
     * @author Ananay
     * @param args
     * @since 2023-04-15
     */
    public static void main(String[] args) {
int a = 6000;
int b = 0;
try {
    int c = a / b;
    System.out.println("The result is "+c);
}
catch(Exception e){
    System.out.println("We failed to divide. Reason: Due to an exceotion");
    System.out.println(e);
}
        System.out.println("Program ended..");

    }
}
