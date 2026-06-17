public class multidimesionalarrays {
    public static void main(String[] args) {
       /* Oops.A multidimensional array is an array of arrays.

        Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

        To create a two-dimensional array, add each array within its own set of curly braces */
        int [][] mynum = {{1,2,3,4,5},{1,2,3,4,5,6,7,8,9}};
        // Access elements
        System.out.println("Accessing Element");
        System.out.println(mynum[1][4]);
        // Change element Values
        System.out.println("Change element");
        mynum[0][2]=2;
        System.out.println(mynum[0][2]);
        // Looping through multidimensional arrays
        System.out.println("Looping");
        for(int[] i : mynum){  // first looping through the array
            for(int j : i){ // Then looping in the selected array
                System.out.print(j);
            }
        }
    }
}
