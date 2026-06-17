package Strings;
//Why strings are immutable in java
//Suppose there rae 5 reference variables having same value "ananay".so all we have same copy of the object.
//but if we change even variable it will cause a problem in the object

public class string {
    /**
     * @author Ananay
     * @param args
     * @since 2023/03/05
     */
    public static void main(String[] args) {
        //Dynamic allocation of the string
        String s = new String("Welcome");//Creating a string through new keyword
        String s1 = "Welcome";
        s1.intern(); //this will add the string to constant pool
        System.out.println(s1);

        //construct string from subset of char array
        byte ascii[]={71,70,71};
        String s4 = new String (ascii);//Converting ascii values in array to string
        System.out.println(s4);

        //Converting to upper cae and lower case
        String name = "ananay";
        System.out.println(name.toUpperCase());
    }
}
