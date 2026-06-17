import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
//        int a =6;
//        int b = 6*a;
//        System.out.println(b);  //= is an assignment operator
        System.out.println(64>5 && 67>8);  // & is a logical operator
        //> and < are the comparison operators
        System.out.println(64<89 || 34<5);   // || is known as or
        int a = 33;
        int b = 34;
        System.out.println(a>b);
        // java logical opertors
        Scanner sc = new  Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x<5 && x>10);
        System.out.println(!(x<5 && x>10)); // here ! is a logical not . It reverses the value and then returns it
    }
}
