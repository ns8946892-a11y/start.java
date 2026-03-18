import java.util.Scanner;
public class km {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometers. ");
        float kilometers = sc.nextFloat();
        
        double miles = (kilometers)*0.62137119;
        System.out.println("Miles is "+miles);
    }
}
