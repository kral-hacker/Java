package InputReading;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name= in.nextLine();
        System.out.println(name);
        int a = in.nextInt();
        System.out.println(a);
        float n =in.nextFloat();
        System.out.println(n);
    }
}
