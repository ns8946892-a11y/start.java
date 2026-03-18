import java.util.Scanner;
public class evenodd{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        boolean iseven = num % 2 == 0;

        if (iseven)
            System.out.println("Number is even.");
        else
            System.out.println("Number is odd.");
    }
}