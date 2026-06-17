import java.io.FileWriter;
import java.io.IOException;

public class file2ex {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("D://text1.txt");
            f.write("Hello World");
            f.close();
            System.out.println("Successfuly written to the file");
        } catch(IOException e){
            System.out.println("Unexpected Error occured");
            e.printStackTrace();
        }
    }
}
