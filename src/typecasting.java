public class typecasting {
    public static void main(String[] args) {
        //Widening Casting (Automatic) smaller data type to bigger data type
        int myint = 9;
        double mydou = myint;
        System.out.println(myint);
        System.out.println(mydou);
        //narrowing casting (manual) larger data type to smaller data type
        double rt = 2453.899056d;
        int ty =  (int) rt;   // narrowing type casting
        System.out.println(rt);
        System.out.println(ty);
    }
}
