package arrays;
import java.io.*;
//Array represents the objects of the corresponding class
//Superclass of array is Object
//Array is dynamically allocated
public class onedarray {
    /**
     * <h1>Creating,Initializing and accessing an array element</h1>
     * @author Ananay
     * @param args
     */
    public static void main(String[] args) throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String a = reader.readLine();
/*Creating
int [] var-name   It is nothing but declaring the array
var-name=new type [size]      This is nothing but memory allocation
var-name = new type [size];   Initialization of array
int[] var-name=new int [size]    Combining both statements
This is known as dynamically allocation*/
        int[] arr = new int[10];
        int[] arr1 = {1,2,3,4,5,6,7};


        //Accessing
        //Using normal for loop
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println();
        //Using for each loop
        for(int i : arr1){
            System.out.println(i);
        }
    }
}
