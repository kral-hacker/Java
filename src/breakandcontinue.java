public class breakandcontinue {
    public static void main(String[] args) {
        // Break
        // If it is used then the loop will break
        for(int i = 0;i<=10;i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
        // Continue
        // The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop
        System.out.println("Continue Statement");
        for (int a = 1;a<=10;a++){
            if(a==4){
                continue;
            }
            System.out.println(a);
        }
    }
}
