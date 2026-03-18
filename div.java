import java.util.Scanner;
public class div {
    public static void main(String args[]){
        int a;
       try( Scanner sc = new Scanner(System.in)){
        System.out.println("Enter a number");
        a = sc.nextInt();
        if(a % 3 == 0 && a % 5 == 0)
        System.out.println("A is also divide by both number.");
        else if(a % 3 == 0 )
        System.out.println("A is divisible by 3.");
        else if(a % 5 == 0)
        System.out.println("A is divisible by 5.");
        else
        System.out.println("Not divisible by 3 and 5.");
       }
    }
    
}
