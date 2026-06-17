public class methodparameters {
    static void myMethod(String fname){
        System.out.println(fname+" Refsneses");
    }
    static void method(String name,int age){  // Adding multiple parameters ia a single method
        System.out.println(name+" is "+age);
    }
    public static void main(String[]args){
        myMethod("Ananay");
        myMethod("Aditi");
        myMethod("Dinesh");
        method("Ananay",18);
    }
}
