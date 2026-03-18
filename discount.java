import java.util.Scanner;
class discount{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
        int bill ;
        System.out.print("Enter your bill. ");
        bill = sc.nextInt();
       
        double discount = 0;
        double finalBill = bill;
        if(bill > 5000){
        discount = (bill * 20)/100;
        System.out.println("You got 20% discount.");
        }
        else if (bill > 2000){
            discount = (bill * 10)/100;
            System.out.println("You got 10% discount.");
        }
        else {
        System.out.println("No discount aviable.");
        }
        finalBill = bill - discount;
        discount = bill - finalBill; 
        System.out.println("Final bill after discount: "+finalBill);
        System.out.println("You save "+discount +" in your bill.");
    }
    }
} 