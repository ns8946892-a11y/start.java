import java.util.Scanner;
class agefind{
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You Able To Vote.");
        }
        else
            System.out.println("You Not Eligblie To Vote.");

    }
}