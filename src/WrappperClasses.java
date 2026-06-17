public class WrappperClasses {
    public static void main(String[] args) {
        // Wrapper classes in java helps us to convert primitive to object and vice versa
        //Primitive to wrapper class
        int a = 20;
        Integer i = Integer.valueOf(a);//Converting int into an object explicitly
        Integer j = a ; //Autoboxing, In autoboxing computer writes the above code internally
//        System.out.println(a+" "+i+" "+j);
//        Wrapper class to primitive
        Integer b = new Integer(3); // converting int to integer
//        int k = b.intValue(); //Converting integer to int explicitly
        int l = b ; //unboxing, now computer will write b.intvalue() internally
    }
}
