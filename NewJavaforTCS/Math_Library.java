public class Math_Library {
    public static void main(){
        //Math.max(x,y)
        int max = Math_Library.max(5,10); // Its is used to get the maximum value
        System.out.println(max);
        //Math.min(x,y)
        int min = Math_Library.min(5,10); //Used to find the minimum number
        System.out.println(min);
        //Math.sqrt(x);
        double sr = Math_Library.sqrt(64); // it is used to find the sqrt
        System.out.println(sr);
        //Math.abs(x);
        float abs = Math_Library.abs(-4.7f);
        System.out.println(abs); //it is used to provide the absolute positive value of x
        //Math.random();
        System.out.println(Math_Library.random()); // It is used to give the exclusive value from 0.0to 1.0
        System.out.println((int) Math_Library.random()*101);
    }
}
