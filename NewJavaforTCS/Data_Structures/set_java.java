package Data_Structures;
import java.util.HashSet;
import java.util.Set;
//hash set dose not maintain the insertion order
public class set_java {
    public static void main(){
//            Initializing the set;
        Set<Integer> s = new HashSet<Integer>();
        s.add(2);
        s.add(3);
        s.add(2);
        System.out.println(s);
//    Checking the size of the set
        System.out.println(s.size());
//        Removing an element from the set
        s.remove(2);
        System.out.println(s);
//        Checkig if the element is present in the set or not
        System.out.println(s.contains(1));
    }
}
