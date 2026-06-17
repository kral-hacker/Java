package arrays;
import java.util.Scanner;
public class jaggedarray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        int a = sc.nextInt();
        int [][] arr = new int[a][];
        for(int i = 0;i<a;i++){
            System.out.println("Enter the number of columns for "+(i+1)+" row");
            int b = sc.nextInt();
            arr[i] = new int[b]; //ith row will have b columns
            for(int k = 0;k<b;k++){
                System.out.println("Enter the "+(i+1)+" "+(k+1)+" element of the matrix");
                arr[i][k] = sc.nextInt();
            }
        }
        System.out.println("Printing the formed jagged array");
        for(int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
