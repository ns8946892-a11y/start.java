import java.util.Scanner;
class per{
    public static void main(String args[]){

        try(Scanner sc = new Scanner(System.in)){
        int a;
        System.out.println("Enter your percentage:");
        a = sc.nextInt();
        if(a >= 90)
        System.out.println("A");
        else if(a >= 75 && a <= 89)
        System.out.println("B");
        else if(a >= 50 && a <= 74)
        System.out.println("C");
        else if(a >= 40 && a <= 49)
        System.out.println("D");
        else
        System.out.println("F");
        }
    }
}