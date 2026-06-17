import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myage = sc.nextInt();
        int vage= 18 ;
        if(myage>=vage){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
        if (20>18){
            System.out.println("20 is greater than 18");
        }
        int time =20;
        if (time<18){
            System.out.println("Good day");
        }
        else if (time==20){
            System.out.println("Fuck off");
        }
        else{
            System.out.println("Good Evening");
        }
    }
}
