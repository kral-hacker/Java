package arrays;
import java.io.*;
import java.sql.SQLOutput;

public class arrayofobjects1 {
    /**
     * <h>Another way of creating the array of objects with only 1 class</h>
     * @author Ananay
     * @since 2023-02-22
     */
    String name;
    int age;
    arrayofobjects1(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array: ");
        String  a = in.readLine();
        int b = Integer.parseInt(a);
        arrayofobjects1[] arr = new arrayofobjects1[b];
        for(int i =0;i<b;i++){
            System.out.println("Please Enter name: ");
            String name = in.readLine();
            System.out.println("Please Enter age: ");
            String age = in.readLine();
            int age1 = Integer.parseInt(age);
            arr[i]= new arrayofobjects1(name,age1);
        }
        System.out.println("Displaying the formed array: ");
        for(arrayofobjects1 d : arr){
//            System.out.println(d);
            System.out.println(d.name+" "+d.age);
        }
    }
}
