package arrays;

public class classobjectsarray {
    /**
     * <h>Class objects of arrays</h>
     * @author Ananay
     * @param args
     * @since 2023-02-22
     */
    public static void main(String[] args) {
        int intarr[]=new int [3];
        byte bytearr[]=new byte[3];
        String strarray[]=new String[3];
        System.out.println(intarr.getClass());
        System.out.println(intarr.getClass());
        System.out.println(bytearr.getClass());
        System.out.println(strarray.getClass());
//        The string “[I” is the run-time type signature for the class object “array with component type int.”
//        The only direct superclass of an array type is java.lang.Object.
//                The string “[B” is the run-time type signature for the class object “array with component type byte.”
//        The string “[S” is the run-time type signature for the class object “array with component type short.”
//        The string “[L” is the run-time type signature for the class object “array with component type of a Class.” The Class name is then followed.
    }
}
