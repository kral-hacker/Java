package operatorsgfg;

public class queston7 {public static void main(String args[])
{
    String s1 = "geeksquiz";
    String s2 = "geeksquiz";
    System.out.println("s1 == s2 is:" + s1 == s2);
} //Remember that the precedence of + is higher than ==
    // SO first ("s1 == s2 is:" + s1) is evaluated and then ("s1 == s2 is:geeksquiz"==s2) is evaluated which is false
}
