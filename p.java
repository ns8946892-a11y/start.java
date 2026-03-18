import java.util.Scanner;
public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_marks = 100;
        System.out.print("Enter first subject marks: ");
        int H = sc.nextInt();

        System.out.print("Enter second subject marks: ");
        int E = sc.nextInt();

        System.out.print("Enter third subject marks: ");
        int M = sc.nextInt();

        System.out.print("Enter fourth subject marks: ");
        int S = sc.nextInt();

        System.out.print("Enter fivth subject marks: ");
        int P = sc.nextInt();

        int percentage = ((H+E+M+S+P)*100)/100;
        System.out.println("Percentage is :"+percentage);
    }
}
