package Arrays;

public class Practicearray {
    public static void main(){
        int[] arr = {1,2,4,5,6};
        int sum = 0;
        // Normal for loop
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        // for each loop
//        for(int num : arr){
//            System.out.println(num);
//        }
        System.out.println(sum);
    }
}
