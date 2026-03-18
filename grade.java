import java.util.Scanner;
public class grade {
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks.");
        num = sc.nextInt();

        String marks = switch(num){
            case 1 -> "A"
        };
    }   
}
