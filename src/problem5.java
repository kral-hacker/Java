/*
Author: kral hacker
Date: 14/01/2023
Purpose: To take an input from the user and then check that the number is less than or greater than the specific number
 */

import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);
    }
}
