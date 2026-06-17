import java.util.Scanner;
public class practiceondowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int a = sc.nextInt();
        do{
            System.out.println(a);
            a++;
        }while(a<50);
    }
}
