import java.util.HashMap;
import java.util.Map;

public class Q6 {
    public static void main(String[] args) {

        Map<String, String> users = new HashMap<>();
        users.put("admin", "Aa123456");
        users.put("agent1", "Pasword123");
        users.put("agent2", "Aa123Pasword123456");
        System.out.println(users.get("admin"));
        System.out.println(users.get("agent1"));
        System.out.println(users.get("agent2"));
    }
}
