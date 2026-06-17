package variables;

/*
Static Variables

Static variables are also known as class variables.

These variables are declared similarly as instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor or block.
Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.
Static variables are created at the start of program execution and destroyed automatically when execution ends.
Initialization of a static variable is not mandatory. Its default value is 0.
If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically.
If we access a static variable without the class name, the compiler will automatically append the class name.
 */
public class staticvariable{
    static String geek = "Ananay Tyagi";

    public static void main(String[] args) {
        staticvariable at = new staticvariable();
        System.out.println(at.geek);
        System.out.println(staticvariable.geek);
        System.out.println(geek);
    }
        }
