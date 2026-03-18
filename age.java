import java.util.Scanner;
class age{
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        a = sc.nextInt();
        if(a >= 18)
        System.out.println("You Eligible to vote");
        else
        System.out.println("Not Eligible to vote");
        sc.close();
    }
}