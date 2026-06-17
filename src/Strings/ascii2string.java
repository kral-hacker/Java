package Strings;

public class ascii2string {
    /**
     * @author ananay
     * @param args
     * @since 2023-03-07
     */
    public static void main(String[] args) {
        byte arr[]={71,70,71};
        String s1 = new String(arr);//this will convert byte to String
        System.out.println(s1);
    }
}
