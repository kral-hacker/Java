package errorandexceptionhandlingcwh;
import java.util.Scanner;
public class handlingspecificexceptions {
    /**
     * <>handling specific exceptions</>
     * @author Ananay
     * @param args
     * @since 2023-04-15
     */
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=45;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index.");
        int a= sc.nextInt();
        System.out.println("Enter the number to whioch the selected marks be divided.");
        int b= sc.nextInt();
        try{
            System.out.println("The value at array index entered is: "+marks[a]);
            System.out.println("The valyue after calvulation is : "+marks[a]/b);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception ocuured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound exception ocuured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception ocuured");
            System.out.println(e);
        }
    }
}
