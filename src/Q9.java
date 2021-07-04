public class Q9 {
    public static void main(String[] args) {
        boolean x;
        int[] numbers = new int[6];
        numbers[0] = 67;
        numbers[1] = 1;
        numbers[2] = 67;
        numbers[3] = 1;
        numbers[4] = 1;
        numbers[5] = 555;

        boolean test = false;
        for (int number : numbers) {
            if (number == 67) {
                test= true;
            }
        }

        if(test){
            System.out.println("Number 67 exist in the array");
        }else {
            System.out.println("Number 67 does not exist in the array");
            }
    }
}
