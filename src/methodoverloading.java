public class methodoverloading {
    static int method(int x,int y){
        return x+y;
    }
    static double method(double x,double y){
        return x+y;
    }
    public static void main(String args[]){
        System.out.println(method(5,6));
        System.out.println(method(5.12,6.14));
    }
}
