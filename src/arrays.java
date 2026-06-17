import java.util.Locale;

public class arrays {
    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single variable
        // We do not have to assign separate variables
        String[] cars = {"Volvo","Mercedes","Ferrari","Maserati"}; // It is an string array
        int[] mynum = {12,23,34,45,45,56,6};
        System.out.println();
        // Accessing the elements of an array
        System.out.println(cars[0]);
        //Changing elements of the array
        cars[0]="Bugati";
        System.out.println(cars[0]);
        //Array length
        System.out.println(mynum.length);
    }
}
