public class Q4 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 22;
        numbers[5] = 555;

        int sum =0;
        int n = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }

        System.out.println("Average of "+sum+" / "+ n+" is "+ sum/n);


    }
}
