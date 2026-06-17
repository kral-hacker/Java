package operatorsgfg;

public class question3 {
    public static void main(String args[])  { //Always remember plus operators work from left to right
    System.out.println(10  +  20 + "GeeksQuiz");
    System.out.println("GeeksQuiz" + 10 + 20);
}
}
/* In the given expressions 10 + 20 + “GeeksQuiz” and “GeeksQuiz” + 10 + 20 ,
there are two + operators, so associativity comes to the picture.
The + operator is left to right. So the first expression is evaluated as (10 + 20) + “GeeksQuiz” and second expression is evaluated as (“GeeksQuiz” + 10) + 20 .
*/