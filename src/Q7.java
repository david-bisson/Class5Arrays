import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Please type a number between 1 to 4");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        try {

            switch (choice) {
                case 1:
                     System.out.println(Seasons.SUMMER);
                     break;
                case 2:
                    System.out.println(Seasons.WINTER);
                    break;
                case 3:
                    System.out.println(Seasons.SPRING);
                    break;
                case 4:
                    System.out.println(Seasons.FALL);
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid choice");
        }
    }
}
