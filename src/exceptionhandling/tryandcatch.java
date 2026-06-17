package exceptionhandling;

public class tryandcatch {
    /**
     * <>Try and catch block exception handling</>
     * @author Ananay
     * @param args
     * @since 2023-03-31
     */
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]); //error(array out of bounds)
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }
        finally{
            System.out.println();
        }
    }
}
