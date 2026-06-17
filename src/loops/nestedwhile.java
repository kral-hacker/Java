package loops;

public class nestedwhile {
    public static void main(String[] args) {
        int i =1,j=1;
        while(i<=3){
            while(j<=3){
                System.out.println(j);
                j++;
            }
            i++;
        }
    }
}
