package DecisionMaking;

public class nestedif {
    /**
     * @author Ananay tyagi
     * @param args
     * @since 2023-02-11
     */
    public static void main(String[] args) {
        int a =10;
        if(a<15 || a==10){
            if(a<15){
                System.out.println("a is less than 15");
            }
            if(a<12){
                System.out.println("a is less than 12 also");
            }
            else{
                System.out.println("you are fucked up");
            }
        }
        else
            System.out.println("a is smaller than 10");
    }
}
