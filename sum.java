import java.util.Scanner;

public class sum{
    public static void main(String args[]){
      try(Scanner  sc = new Scanner(System.in)){
        int a , b;
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two number is:"+sum);
        

      }
    }
}