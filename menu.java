import java.util.Scanner;
public class menu {
    public static void main(String args[]){
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();

        String Menu = switch(num){
            case 1 -> "Open";
            case 2 -> "Start";
            case 3 -> "Stop";
            case 4 -> "Restart";
            case 5 -> "End!";
            default -> "Invalid input!";
        };
        System.out.println(Menu);
        sc.close();
    }
}
