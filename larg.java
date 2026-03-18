import java.util.Scanner;
class larg{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        int a,b,c;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number:");
        b = sc.nextInt();
        System.out.print("Enter third number:");
        c = sc.nextInt();
        if(a > b && a > c)
        System.out.println("A is largest number");
        else if(b > a && b > c)
        System.out.println("B is largest number");
        else if(c > a && c > b)
        System.out.println("C is largest number");
        else 
        System.out.println("Not possible!");
        }
    }
}