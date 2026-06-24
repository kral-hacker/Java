package OOPS;

public class Class_and_Objects {
    int x = 10; // attribute: are the variables that belong to a class;
}
class Second{
    int y = 12;
}

class Main{
    public static void main(){
        Class_and_Objects obj = new Class_and_Objects(); // creating an object using the new keyword
        Class_and_Objects obj2 = new Class_and_Objects(); // creating an object using the new keyword
        System.out.println(obj.x);
        System.out.println(obj2.x);

        Second sobj = new Second();
        System.out.println(sobj.y);
        // chaning the value of the attributes
        sobj.y = 10;
        System.out.println(sobj.y);
    }
}
