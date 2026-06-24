package Methods;

public class Recursion {
    static int sum(int num){
        // base case
        if(num<=0) return 0;
        return num+sum(num-1);

    }
    public static void main(){
    int ans = sum(9);
        System.out.println(ans);
    }
}
