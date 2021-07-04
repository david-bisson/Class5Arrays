import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q5 {
    public static void main(String[] args) {

        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Hello");
        hash_Set.add("Hello");
        hash_Set.add("Hello");
        hash_Set.add("Hello");
        hash_Set.add("Hello");
        Iterator<String> value = hash_Set.iterator();
        while (value.hasNext()){
            System.out.println(value.next());  // ONLY 1 Hello will be the output
        }

    }
 }

