import java.util.Scanner;
public class even_odd {
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        num = sc.nextInt();
        int rem = num %2;
        switch(rem) {
        case 0:
        System.out.println("Number is even.");
        break;
        default :
        System.out.println("Number is odd.");
        
        
        }
        sc.close();
    }
}
