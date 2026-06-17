package arrays;
//Cloning of arrays using .clone()

public class cloningofarrays {
    /**
     * @author Ananay
     * @param args
     * @since 2023-02-23
     */
    public static void main(String[] args) {
        //One d arrays
        System.out.println("1 d arrays");
        int arr[] = new int[]{1,2,3};
        int clonedarray[] = arr.clone(); //This creates a deep copy of the array
        System.out.println(clonedarray==arr);//False because  deep copy have different copies
        for(int i : clonedarray){
            System.out.print(i+" ");
        }
        System.out.println("Multidimesional arrays");
        //Mulitidimensional arrays
        int arr2[][]=new int[][]{{1,2,3},{4,5}}; //array literal
        int arr3[][]=arr2.clone();
        System.out.println(arr2==arr3);//False
        //But it creates a shallow copy which is same for both the arrays
        System.out.println(arr2[0]==arr3[0]);//true
    }
}
