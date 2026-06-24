package Data_Structures;
import java.util.LinkedList;
// If i wanted it to implement in ds
class Node{
    public int num;
    public Node next;
    public Node(int num){
        this.num = num;
        this.next = null;
    }
}

public class linkedList {
    public static void main(){
//        Intializing the linked list;
    LinkedList<Integer> ll =  new LinkedList<Integer>(); // always use wrapper classes instead of the primitive data types;
//    adding the elements in the linked list
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
//        Adding element at the beginning of the list;
        ll.addFirst(0);
        System.out.println(ll);
//        Adding element to the last of the list;
        ll.addLast(4);
        System.out.println(ll);
    }

}
