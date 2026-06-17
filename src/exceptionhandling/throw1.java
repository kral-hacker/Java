package exceptionhandling;

public class throw1 {
    public static void checkage(int age){
        if(age<18){
            throw new ArithmeticException("You are not old enough , Access Denied");
        }else{
            System.out.println("Access granted.");
        }
    }
    public static void main(String[] args) {
        checkage(19);
    }
}
