import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Sky", "Maltese", 1);
        Dog dog2 = new Dog("Jumpy", "Puddle", 2);

        ArrayList<Dog> myDogs = new ArrayList<>(); // Create an ArrayList which can hold Strings
        myDogs.add(dog1); // Add a new object (String) to ArrayList
        myDogs.add(dog2); // Add a new object (String) to ArrayList

        System.out.println(myDogs.get(0).name);


        myDogs.remove(0);
        myDogs.remove(0);
        System.out.println(myDogs.size());

    }
}
