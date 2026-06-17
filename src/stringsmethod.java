/*
Author: kral hacker
Date: 16/01/2023
purpose: Strings method
 */

public class stringsmethod {
    public static void main(String[] args) {
        String name = "Ananay";
        int value = name.length();  // .length() function is used to get the length of the variable
        System.out.println(value);
        String  lstring = name.toLowerCase(); //This method is used to return the string in lowercase
        System.out.println(lstring);
        String  Ustring = name.toUpperCase(); //This method is used to return the string in Uppercase
        System.out.println(Ustring);
        String nontrimmedstring = "               kral             "; // string with spaces
        System.out.println(nontrimmedstring.trim()); // trim method is used to remove the spaces from the string

        System.out.println(name.substring(3)); // the substring method is used to print after the indexes
        System.out.println(name.substring(2,4)); //here it is used for the start and the end point the end point is not included

        System.out.println(name.replace('a','n'));// .replace is used to replace the characters in the string and it returns the new string
        //Concatinating 2 strings
        String fn = "John ";
        String ln = "Red";
        System.out.println(fn.concat(ln));
    }
}
