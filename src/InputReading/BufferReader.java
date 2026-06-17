package InputReading;
import java.io.*;
public class BufferReader {
    /**
     * <h1>BufferedReader</h1>
     * @author ananay
     * @param args
     * @since 2023-02-10
     */
    public static void main(String[] args)
        throws IOException{
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)); // Declaring the buffer reader
        System.out.println("Enter your name: ");
        String name=reader.readLine(); //Taking input from the user
        System.out.println(name);
        String num1 = reader.readLine();// Taking inputs of other datatypes
        int num = Integer.parseInt(num1);
        System.out.println(num);
        /*
        To take other datatype inputs we will first tke the input
        in string and then convert it into other datatype with the help of parse method.
         */
        }
    }

