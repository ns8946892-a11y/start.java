public class SumOfTenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        // Ensure there are exactly 10 arguments
        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers as command line arguments.");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum of 10 numbers is: " + sum);
    }
}
