import java.io.*;
import java.sql.SQLOutput;

public class file3ex {
    public static void main(String[] args) {
        FileReader f1;
        try{
            f1 = new FileReader("D://text1.txt");
            int i;
            while((i=f1.read())!=-1){
                System.out.print((char)i);
            }
            f1.close();
        }
        catch(FileNotFoundException exception){
            System.out.println("Unexpected error ocurred");
            exception.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
