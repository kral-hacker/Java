/*
Author: kral hacker
Date: 14/01/2023
Purpose: Different ways of print statement
 */
import java.util.Scanner;
public class printstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kral hacker");
        int a = 6;
        float b = 5.64734f;
        System.out.printf("The value of a is %d anf the value of b is %f",a,b);//here %d and %f  are the format specifiers
        System.out.format("The value of a is %d anf the value of b is %f",a,b);//here %d and %f  are the format specifiers
        String name = sc.nextLine();
        System.out.println(name);
    }
}
