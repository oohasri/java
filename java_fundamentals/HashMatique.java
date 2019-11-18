import java.util.HashMap;
import java.util.Set;
public class HashMatique {
    HashMap<String, String> tracklist = new HashMap<String, String>();
    public void hashmap() {
        tracklist.put("Every night","Every night in my dreams");
        tracklist.put("If you are", "If you are happy");
        Set<String> keys = tracklist.keySet();
        for(String key : keys) {
            System.out.println(key +":"+ tracklist.get(key));
            // System.out.println(tracklist.get(key));    
        }
    }
}