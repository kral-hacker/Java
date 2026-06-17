public class Associativityandprecedence {
    public static void main(String[] args) {
        //precedence and associativity
        int a = 6 * 5 - 34 / 2;
        System.out.println(a);
        /*
            30-17
            =13
        */
        int b = 60 / 5 - 34 * 2;   // If precedence is same for the operators then associativity for / and * is from left to right
        System.out.println(b);
       /*
          12-68
          -56
        */
    }
}
