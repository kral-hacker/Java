package TakingInput;
import java.util.Scanner;

public class taking_input {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your name is "+name+" and your age is "+age);
    }
}
