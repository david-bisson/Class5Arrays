import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<String>(); // Create an ArrayList which can hold Strings
        myList.add("word"); // Add a new object (String) to ArrayList
        myList.add("aaaaa"); // Add a new object (String) to ArrayList
        myList.add("bbbbb"); // Add a new object (String) to ArrayList
        myList.add("cccc"); // Add a new object (String) to ArrayList
        myList.add("dddd"); // Add a new object (String) to ArrayList
        myList.add("eeeee"); // Add a new object (String) to ArrayList
        myList.add("ggggg"); // Add a new object (String) to ArrayList
        myList.add("ggggg"); // Add a new object (String) to ArrayList
//        myList.set(0,"ggggg"); // Change the value in a given index (0) to a new value (word2)
//
        // Print all the array elements
//        for (int i = 0; i < myList.size(); i++) { // Iterate through an array
//            System.out.println(myList.get(i));
//        }
        for (int i = 0; i < myList.size(); i++) { // Iterate through an array
            if (myList.get(i)=="ggggg"){
                System.out.println(myList.get(i));
            }

        }

//        myList.remove(0); // Remove a specific index from ArrayList
    }
}
