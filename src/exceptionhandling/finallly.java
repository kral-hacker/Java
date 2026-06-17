package exceptionhandling;

public class finallly {
    /**
     * <>The finally keyword</>
     * @author Ananay
     * @param args
     * @since 2023-03-31
     */
    public static void main(String[] args) {
        try{
            int [] arr={1,2,3,4,5,6};
            System.out.println(arr[10]);
        }
        catch (Exception e ){
            System.out.println("Something went wrong.");
        }
        finally{
            System.out.println("Try and catch is ended."); //finally keyword always gets excted no matter what the result is.
        }
    }
}
