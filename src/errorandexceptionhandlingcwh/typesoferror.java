package errorandexceptionhandlingcwh;
import java.util.Scanner;
/*
Errors are of 3 types
Syntax
Logical
Runtime error (Exception)(User defined errors)
 */

public class typesoferror {
    /**
     * <>Errors and exception handling</>
     * @author Ananay
     * @param args
     * @since 2023-04-15
     */
    public static void main(String[] args) {
        //Logical error
//        int a = 5// Error : no semicolon
//        int b = 9;
//        int c = 0;
//        System.out.println(a+b);
        //logical error demo
        System.out.println(2);
        for(int i =1;i<5;i++){
            System.out.println(2*i+1);
        }// it will print 9 also which is not a prime number.Hence this program contains logical errors

        //Runtime error
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Integer part of 1000/k is "+1000/k); // It will throw an exception for the user
    }
}
