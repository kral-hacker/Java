import java.io.*;
public class Q2filehandling {
    public static void main(String[] args) {
        FileReader f1;
        FileReader f2;
        FileWriter f;
        try{
            f = new FileWriter("D://text.txt");
            f1 = new FileReader("D://file2.txt");
            f2 = new FileReader("D://text1.txt");
            int i;
            while((i=f1.read())!=-1) {
                f.write((char) i);
            }
            f1.close();
            while((i=f2.read())!=-1){
                f.write((char)i);
            }
            f.close();
            f2.close();
        }
        catch(FileNotFoundException exception){
            System.out.println("Unexpected Error found");
            exception.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
