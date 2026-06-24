package Data_Structures;
//Map is used to store the key value pairs;
import java.util.HashMap;
//hashmap is fast and unordered;
// In respect to c++ it is the unordered map;

public class Map_Java {
    public static void main(){
//        Intitalizing the map
    HashMap<String, Boolean> map = new HashMap<String, Boolean>();
/*
In c++ it is the unordered map
unordered_map<string, int> m;
 */

//        Adding the element in the map
        map.put("Ananay", Boolean.TRUE);
        map.put("Tyagi", Boolean.TRUE);
        System.out.println(map);

//        Getting the values from the map using the key
        System.out.println(map.get("Aditi"));
        

    }
}
