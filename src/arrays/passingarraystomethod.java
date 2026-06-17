package arrays;
//Arrays can also be passed to the methods

public class passingarraystomethod {
    public static void main(String[] args) {
        /**
         * <>arrays can also be passed to the methods</>
         * @author Ananay
         * @since 2023-02-22
         */
        int[] arr=new int[]{1,2,3,4}; //array literal
        passingarraystomethod ac = new passingarraystomethod();
        ac.sum(arr);
    }
    public void sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
