import java.util.Scanner;

public class partice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // int i = 1;
        // while(i <= 10){
        // System.out.println(n+ "x" + i + "=" +(n*i));
        // i++;

        // }

        // while loop se us number ke digits ka sum nikalo.

        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // int i = 1;
        // int sum =  0;
        // while(num > 0 ) {
        //     int digit  = num % 10;
        //     sum = sum + digit;
        //     num  = num / 10;
            
        // }
        // System.out.println("Sum is = "+sum);

        
        // Palindrome Program Means (121) It's revers is same.

        System.out.println("Enter number:");
        int num = sc.nextInt();
        int temp = num;
    
        int rnum = 0;
         
        while(num > 0){
            int digit  = num % 10;
            rnum = rnum * 10 + digit;
            num = num / 10;
        }
        if(temp == rnum){
            System.out.println("Number is palimdrome.");
        }
        else{
            System.out.println("Number is not a palindrome.");
        }

        // Number Reverse 

        // System.out.println("Enter Number:");
        // int num = sc.nextInt();
        // int fnum = 0;

        // while(num > 0){
        //     int digit = num % 10;
        //     fnum = fnum * 10 + digit;
        //     num = num / 10;
        // }
        // System.out.println("Reverse number is = "+fnum);

        // Print First n Number.

        // System.out.print("Enter number: ");
        // int n =  sc.nextInt();
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i <= n);

        // For Loop.

        // Print n odd number.

        // 2i = Even Number 0 , 2 , 4 , 6 , 8 
        // 2i+1 = Odd Number 1 , 3 , 5 , 7 , 9

        // System.out.print("Enter number: ");
        // int n = sc.nextInt();

        // for(int i = 0; i < n; i++){
        //     System.out.println(2*i+1);
        // }

        // int n = 10;
        // for(int i = n; i > 0; i--){
        //     System.out.println(i);
        // }

        // for(int i = 1;i <= 10; i++){
        //     System.out.println(2*i);
        // }

        // Table Print

        // System.out.print("Enter number:");
        // int n = sc.nextInt();

        // for(int i = 1; i <= 10; i++){
        //     System.out.println(+n+"x"+i+ "=" +(n*i));
        // }

        // Factorial print.

        // System.out.print("Enter a number:");
        // int n = sc.nextInt();
        // int fact = 1;

        // for(int i = 1;i <= n; i++){
        //     fact = fact * i;
        // }
        // System.out.println(fact);

        // System.out.print("Enter number:");
        // int num = sc.nextInt();
        // int sum = 0;

        // for(int i = 1;num < 0;i++){
        //     int digit = num % 10;
        //     num = num / 10;
        //     sum = sum + digit;
        // }
        // System.out.println(sum);
    }
}
