public class oops{
    int x = 5;
    public static void main(String[] args) {
        oops myobj = new oops();
        System.out.println(myobj.x);
        oops myobj1 = new oops();
        oops myobj2 = new oops();
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
    }
}