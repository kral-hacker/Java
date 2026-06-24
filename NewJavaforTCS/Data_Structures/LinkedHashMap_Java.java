package Data_Structures;
// linked hash map stores the key  value pairs in the same order they are inserted
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LinkedHashMap_Java {
    public static void main(){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("Ananay", 1);
        map.put("Aditi", 2);
        System.out.println(map);
    }
}
