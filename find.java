import java.util.Scanner;

public class find {
    public static void main(String[] args)
    {
    System.out.println("Enter your age: ");
     try (Scanner sc = new Scanner(System.in)){
    
    int age = sc.nextInt();
    
    if(age >= 18 ){
        System.out.println("Eligibility to vote");
    }
    
    else{
        System.out.println("Not Eligibility ");
    }
     }
    }
}