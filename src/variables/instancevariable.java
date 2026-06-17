package variables;

/*Author: Kral Hacker
 Purpose: Instance Variables variable
 */
public class instancevariable {
    //As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
    public String geek="Ananay Tyagi";  // Declaring an instance variable. Its default value is 0.
//    public instancevariable(){
//        this.geek="Ananay Tyagi"; // initialization instance variable
//    }
    //Instance variables are only aaccessed by creating objects
    public static void main(String[] args) {
        instancevariable name = new instancevariable(); //Creating an Object
        System.out.println(name.geek);
// making multiple copies of instance variable
        instancevariable name1 = new instancevariable();
        name1.geek="Kral Hacker";
        System.out.println(name1.geek);

    }
}