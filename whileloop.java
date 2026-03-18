import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.Print Even Number 1 To 100.
        // int i = 1;
        // int num = 50;
        // while(i <= num){
        // System.out.println(2*i);
        // i++;
        // }

        // 2.Print Odd Number.
        // int i = 1;
        // int num = 50;
        // while (i < num) {
        // System.out.println(2*i+1);
        // i++;
        // }

        // 3.Sum of digit.

        // System.out.println("Enter the number:");
        // int num = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i <= num ) { // step 1 step 2 step 3
        // int digit = num % 10; // digit = 126 % 10 = 6 digit = 12 % 10 = 2 digit = 1 %
        // 10 = 1
        // num = num / 10; // num = 126 / 10 = 12 num = 12 / 10 = 1 num = 1 / 10 = 0
        // sum = sum + digit; // sum = 0 + 6 sum = 6 + 2 sum = 8 + 1
        // } // sum = 6 sum = 8 sum = 9
        // System.out.println(sum);

        // 4.Find the sum of numbers from 1 to N (N user se input lo).

        // System.out.print("Enter Number: ");
        // int num = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i <= num) {

        // sum = sum + i;
        // i++;
        // }
        // System.out.println(sum);

        // 5.Print Table From user

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // int i = 1;
        // while(i <= 10) {
        // System.out.println(num+ " X " +i+ " = " +(num*i));
        // i++;
        // }

        // 6.Count the digits of a given number.

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // int count = 0;

        // while(num > 0) {

        // num = num / 10;
        // count++;
        // }
        // System.out.println(+count);

        // sum of first 10 number

        // int sum = 0;
        // for (int i = 1; i <= 10; i++) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        // 7.count number of digits

        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // int count = 0;
        // while(num > 0) {
        //     num = num / 10;
        //     count = count + 1;
        // }
        // System.out.println(count);

        // 8.factorial of a number

        // int res = 1;
        // int n = 7;
        // while(n > 0) {
        //     res = res * n;
        //     n--;
        // }
        // System.out.println(res);

        // 9.Reverse a number.

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        for(int i = n;n >= 0;i--){
            System.out.println(i);
        }

    }
}
