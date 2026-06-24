package Data_Structures;
// The Linked Hash Set is used to store unique elements and it maintains the order the elements are added in;
import javax.sound.sampled.Line;
import java.util.LinkedHashSet;
import java.util.HashSet;
public class LinkedHashSetJava {
    public static void main(){
//        Intializing the LinkedHashSet;
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
//        Adding the element in the linked Hash set;
        lhs.add(1);
        lhs.add(2);
        lhs.add(10);
        System.out.println(lhs);

//        Normal HashSet does not maintain the elements order
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(1);
        h.add(2);
        h.add(10);
        System.out.println(h); // this would give the different order everytime
    }
}
