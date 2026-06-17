package Oops.polymorphism;
//Polymorphism of two types
//Overloading
//Overriding
public class poly1 {//Overloading
    public int  add(int a,int b){
        return a+b;
    }
    public double add(double a,double b,double c){
        return a+b+c;
    }
public int add(int a,int b,int c ){
        return a+b+c;
}
public static void main(String args[]){
    poly1 obj = new poly1();
    System.out.println(obj.add(1,2,3));
    System.out.println(obj.add(12.3,34.4,7.89));
    }
}
