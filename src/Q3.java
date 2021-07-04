import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(); // Create an ArrayList which can hold Strings
        names.add("Tree"); // Add a new object (String) to ArrayList
        names.add("Flowers"); // Add a new object (String) to ArrayList
        names.add("Grass"); // Add a new object (String) to ArrayList

        for (int i = 0; i < names.size() ; i++) {
            if (i==1){
                System.out.println(names.get(i));
                break;
            }
        }
    }

}
