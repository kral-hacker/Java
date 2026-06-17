//import java.io.*;
//import java.lang.*;
//public class Q3filehandling {
//    public static void main(String[] args) {
//        FileReader f1;
//        try{
//            f1 = new FileReader("D://pallindrome.txt");
//            int i;
//            while((i=f1.read())!=-1){
//                String a = String.valueOf((char)i);
//                StringBuffer sb = new StringBuffer(a);
//                String b = String.valueOf(sb.reverse());
//                if(a.equals(b)){
//                    System.out.print(a+" is a pallindrome");
//                }
//                else{
//                    System.out.print(a+" is not a pallindrome");
//                }
//            }
//        }
//        catch(FileNotFoundException exception){
//            System.out.println("Unexpected error ocured");
//            exception.printStackTrace();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//}
import java.io.*;
import java.util.ArrayList;

public class Q3filehandling {
    public static void main(String[] args) {
        String fileName = "D://pallindrome.txt"; // Replace with your file name
        ArrayList<String> palindromes = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();

            while (line != null) {
                line = line.trim();

                if (isPalindrome(line)) {
                    palindromes.add(line);
                }

                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Palindrome strings in the file:");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }
    }

    private static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Ignore case
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
