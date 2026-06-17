//array of objects
package arrays;
class Student{
    /**
     * <h1>array of objects<h1/>
     * @author Ananay
     * @since 2023-02-21
     */
    int age;
    String name;
    Student(int age,String name){
        this.name=name;
        this.age=age;
    }
}
public class arrayofobjects {
    /**
     * <>Array of onjects of diffrent class</>
     * @author Ananay
     * @param args
     */
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0]=new Student(12,"Ravi");
        arr[1]=new Student(12,"Ravi");
        arr[2]=new Student(12,"Ravi");
        arr[3]=new Student(12,"Ravi");
        arr[4]=new Student(12,"Ravi");
        for(Student i: arr){
            System.out.println(i.age+" "
                    +i.name);
        }
    }
}
