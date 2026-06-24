package Data_Structures;
import Oops.inheritance.A;

import java.lang.reflect.Array;
import java.util.ArrayList; //vectors for java
import java.util.Collections;
public class array_list {
    public static void main(){
        /*
        In java array are fixed size ds;
        String[] arr = {};
        so if we want to add a new element in our array thats not possible
        In c++ we have vectors to solve the problem
        vector<int> arr;
        In Java we have ArrayList;
         */
//        Initializing the array list
        ArrayList<String> arr = new ArrayList<>();
//        Adding elements in the arr list;
        arr.add("Ananay");
        arr.add("Tyagi");
        System.out.println(arr);
//        ArrayList<int> num = new ArrayList<>(); this would give an error;
        ArrayList<Integer> num = new ArrayList<>(); // always remember that never to use primitive data types, use wrapper classes;
        num.add(1);
        num.add(2);
        System.out.println(num.get(0));
        System.out.println(num);
        for(String word : arr){
            System.out.print(word);
        }


//        Intializing the Arraylist;
        ArrayList<String> cars = new ArrayList<String>();

//        Adding in the elements in the arrlist;
        cars.add("Maserati");
        cars.add("Ferrari");
        System.out.println();
        System.out.println(cars);
//        Accessing the element
        cars.get(1);

//        Changing an element at a specific index
        cars.set(1,"Tesla");
        System.out.println(cars);

//        removing an element
        cars.remove(0);
        System.out.println(cars);

//        Checking the size of the array list;
        System.out.println(cars.size());

//        Sorting an array
        Collections.sort(cars);
    }
}
