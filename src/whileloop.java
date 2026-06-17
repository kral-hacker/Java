import java.sql.SQLOutput;
import java.util.SortedMap;

public class whileloop {
    public static void main(String[] args) {
        // Simple while loop
        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;}
        //DO while loop
            System.out.println("Do while loop"); // in dow while loop first loop is executed and then condition is checked
            int b = 0;
            do{
                System.out.println(b);
                b++;
            }
            while(b<5);
        System.out.println("Another do while program");
            int a = 10;
            do{
                System.out.println(a);
                a++;
            }while(a<5);
    }
}
