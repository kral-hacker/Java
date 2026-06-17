import java.io.*;
public class fileex {
    public static void main(String args[]){
        File fo = new File("D://file1.txt");
        if (fo.exists()){
            System.out.println("The file exists");
            boolean success = fo.renameTo(new File("D://file2.txt"));
            if(success){
                System.out.println("The file was successfully renamed");
            }
            else{
                System.out.println("The file has not be renamed");
            }
        }
        else{
            System.out.println("File does not exist");
        }
    }
}
