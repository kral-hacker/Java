package operatorsgfg;

public class question2 {
    public static void main(String args[])  {
        int x = -1;
        System.out.println(x>>>29);  //Remember this the unsigned shift operators
        System.out.println(x>>>30);  //Remember it shifts the bits to the right and eliminates 0.
        System.out.println(x>>>31);
    }
}
