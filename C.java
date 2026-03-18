import java.util.Scanner;
public class C{
    public static void main(String[] args) {
        double num1,num2;
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        
        System.out.println("Enter your choice -->");
        System.out.println("1.Addtion.");
        System.out.println("2.Subtraction.");
        System.out.println("3.Multiplication.");
        System.out.println("4.Division.");
        System.out.println("5.Modules.");
        result = sc.nextInt();
        switch(result){
            case 1:
                System.out.println("Addtion is:"+(num1+num2));
                break;
            case 2:
                System.out.println("Subraction is:"+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication is:"+(num1*num2));
                break;
            case 4:
                System.out.println("Division is:"+(num1/num2));
                break;
            case 5:
                System.out.println("Modulas is:"+(num1%num2));
                break;
            default:
                System.out.println("Invalid input");
                sc.close();
        }
    }
}