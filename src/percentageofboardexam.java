import java.util.Scanner;

public class percentageofboardexam {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter thr marks of the first subject");
        int a1 = scr.nextInt();
        System.out.println("Enter thr marks of the second subject");
        int a2 = scr.nextInt();
        System.out.println("Enter thr marks of the third subject");
        int a3 = scr.nextInt();
        System.out.println("Enter thr marks of the fourth subject");
        int a4 = scr.nextInt();
        System.out.println("Enter thr marks of the fifth subject");
        int a5 =scr.nextInt();
        int sum = (a1+a2+a3+a4+a5)/5;
        System.out.println("Hence the percentage of the student in the board exam is: ");
        System.out.print(sum);
    }
}
