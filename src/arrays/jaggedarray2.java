package arrays;
import java.util.Scanner;
//In jagged arrays we can make a multidimesional array with no fixed columns in rows
public class jaggedarray2 {
    /**
     * <h1>The jagged arrays</h1>
     * @author Ananay
     * @param args
     * @since 2023-02-25
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the jagged matrix");
        int a = sc.nextInt();
        String arr[][]= new String[a][];
        for(int i = 0;i<a;i++){
            System.out.println("Enter the number of columns in "+i+" row");
            int b = sc.nextInt();
            arr[i]= new String [b];
            for(int j=0;j<b;j++){
                System.out.println("Enter the element you want to show");
                arr[i][j]=sc.next();
            }
        }
        System.out.println("Printitng the formed jaggeed array");
        for(int i =0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
