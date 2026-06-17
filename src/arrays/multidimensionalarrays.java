package arrays;
//Multidimensional Arrays are also knows as jagged arrays

public class multidimensionalarrays {
    public static void main(String[] args) {
        /**
         * <h>Multidimensional arays</h>.
         * @author Ananay
         * @since 2023-02-22
         */
        int arr[][]= new int [3][3];//3 Rows and 3 columns
        int arr1[][]={{1,2,3},{3,2,1},{7,8,9}};//Declaring and initializing 2d array
        //Printing the 2d array
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]+" ");
            }System.out.println();
        }
    }
}
