public class forloop {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            System.out.println(i);
        }
        //program to print even numbers
        for(int i=0;i<=10;i+=2){
            System.out.println(i);
        }
        //For each loop
        // It is used to loop through an array of elements
        String[] cars = {"Volvo","ferrari","BMW"};
        for(String i : cars){
            System.out.println(i);
        }
    }
}
