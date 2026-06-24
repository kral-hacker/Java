package Data_Structures;
import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class Sorting_using_the_collections {
    public static void main(){
    int[] arr = {5,2,7,1,4};
//    Sorting the arr in ascending order;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // we will have to covert it to string to sout the arr;
//        Sorting in the descending order
//        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString((arr)));
//   Sorting the arrlist
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(5);
        arr1.add(1);
        arr1.add(4);
        arr1.add(6);
        Collections.sort(arr1);
        System.out.println(arr1);
//        Sortitng in the descending order;
        Collections.sort(arr1, Collections.reverseOrder());
        System.out.println(arr1);
    }
}
