//Author: kral hacker
//DAte: 09/01/2023
//Purpose:  taking input from the user
import java.util.Scanner;
public class takinginputfromtheuser {
    public static void main(String[] args) {
        System.out.println("Taking input from the user: ");
        Scanner sc = new Scanner(System.in);  // object
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of these number is : ");
        System.out.println(sum);
        String str = sc.nextLine();
        System.out.println(str);
//        boolean b1 = sc.hasNextInt(); //This command is to check whether thr user is returning int or not
//        System.out.println(b1);
    }
}
