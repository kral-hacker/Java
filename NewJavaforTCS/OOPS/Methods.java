package OOPS;

public class Methods {
    String name = "Ananay Tyagi";
    void function(){
        System.out.println(name);
    }
}
class Main1{
    public static void main(){
        Methods obj = new Methods();
        obj.function();
    }
}