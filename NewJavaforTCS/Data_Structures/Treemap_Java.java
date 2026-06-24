package Data_Structures;
//Tree map stores the key values pairs in sorted way by key;
import javax.security.auth.callback.CallbackHandler;
import java.util.TreeMap;
public class Treemap_Java {
    public static void main(){
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
//        Inserting the values in the map;
        map.put('A', map.getOrDefault("Ananay", 0)+1);
        map.put('d',1);
        System.out.println(map);

    }
}
