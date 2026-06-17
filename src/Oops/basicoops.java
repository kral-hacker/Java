package Oops;

public class basicoops {
    static String emp;
    static float sal;
    static void set(String n,float p){
        emp=n;
        sal=p;
    }
    static void get(){
        System.out.println(emp);
        System.out.println(sal);
    }
    public static void main(String args[]){
        set("Ananay Tyagi",924756);
        get();
    }
}
