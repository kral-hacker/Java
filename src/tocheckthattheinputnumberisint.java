import java.util.Scanner;
public class tocheckthattheinputnumberisint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = sc.hasNextInt();
        System.out.println(a);
    }
}
