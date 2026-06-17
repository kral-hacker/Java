public class problem4 {
    public static void main(String[] args) {
        //encrypting a grade
        char grade = 'B';
        grade = (char)(grade + 8);// casting
        System.out.println(grade);
        //Decrypting a grade
        System.out.println((char)(grade-8));
    }
}
