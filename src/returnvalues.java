public class returnvalues {
    public static int method(int num){  // using int instead of void
        return 5+num;
    }
    static void checkage(int age){  // Using if else statement in a method.
        if(age<18){
            System.out.println("Access Denied--You are not old enough.");
        }
        else{
            System.out.println("Access Granted--You are old enough.");
        }
    }
    public static void main(String args[]){
        System.out.println(method(5));
        checkage(16);
    }
}
