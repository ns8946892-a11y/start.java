import java.util.Scanner;

public class partice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // Even And Odd Check.
        // if(num % 2 == 0){
        // System.out.println("Number is Even. ");
        // }
        // else{
        // System.out.println("Number is Odd. ");
        // }

        // Check Number is Positive Or Negative.
        // if(num > 0){
        // System.out.println("Number is Positive.");
        // }
        // else if(num < 0){
        // System.out.println("Number is Negative.");
        // }
        // else{
        // System.out.println("Number is Zero.");
        // }

        // Check Eligible For Vote.

        // System.out.print("Enter Your Age.");
        // int age = sc.nextInt();

        // if(age >= 18)
        // System.out.println("Eligible For Vote.");
        // else
        // System.out.println("Not Eligible For Vote.");

        // Print Grade.
        // if (num >= 90) {
        //     System.out.println("A Grade");
        // } else if (num >= 75) {
        //     System.out.println("B Grade");
        // } else if (num >= 50) {
        //     System.out.println("C Grade");
        // } else {
        //     System.out.println("Fail");
        // }

        // Find Greatest Number.

        // System.out.print("Enter First Number: ");
        // double num1 = sc.nextDouble();

        // System.out.print("Enter Second Number: ");
        // double num2 = sc.nextDouble();

        // System.out.print("Enter Third Number: ");
        // double num3 = sc.nextDouble();

        // if(num1 > num2 && num1 > num3){
        //     System.out.println("First Number is Greatest: "+num1);
        // }
        // else if(num2 > num1 && num2 > num3){
        //     System.out.println("Second number is Greatest: "+num2);
        // }
        // else if(num3 > num1 && num3 > num2){
        //     System.out.println("Third number is Greatest: "+num3);
        // }
        // else{
        //     System.out.println("Number is Invaild!");
        // }

        // Check Character is Vowel or Consonat.

        // System.out.println("Enter a character.");
        // char ch = sc.next().charAt(0);

        // if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //     System.out.println("Character is a Vowel.");
        // }
        // else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
        //     System.out.println("Charcter is Vowel.");
        // }
        // else{
        //     System.out.println("Character is Consonat.");
        // }

        // Check Enter Year Leap Year Or Not.

        // System.out.println("Enter a vaild Year.");
        // long year = sc.nextLong();

        // if((year % 4 == 0 && year != 100 ) || (year % 400 == 0)){
        //     System.out.println("Leap Year.");
        // }
        // else{
        //     System.out.println("Not a Leap Year.");
        // }

        // System.out.println("Enter a Grade.");
        // char grade = sc.next().charAt(0);

        // switch(grade){
        //     case 'A':
        //         System.out.println("A Grade.");
        //         break;
        //     case 'B':
        //         System.out.println("B Grade.");
        //         break;
        //     case 'C':
        //         System.out.println("C Grade.");
        //         break;
        //     case 'D':
        //         System.out.println("D Grade.");
        //         break;
        //     default:
        //         System.out.println("Fail");
        // }


        // Pratice Question

        // System.out.print("Enter first subject marks: ");
        // int sub1 = sc.nextInt();
        // System.out.print("Enter Second subject marks: ");
        // int sub2 = sc.nextInt();
        // System.out.print("Enter third subject marks: ");
        // int sub3 = sc.nextInt();

        // float avg = (sub1+sub2+sub3)/3.0f;

        // if(avg >= 40 && sub1 > 33 && sub2 > 33 && sub3 > 33 ){
        //     System.out.println("Pass");
        // }
        // else{
        //     System.out.println("Fail");
        // }

        // Print Day of name 

        // System.out.print("Enter the number (1-7): ");
        // String day = sc.next();

        // switch (day) {
        //     case "1":
        //         System.out.println("MONDAY");
        //         break;
        //     case "2":
        //         System.out.println("TUESDAY");
        //         break;
        //     case "3":
        //         System.out.println("WEDNESDAY");
        //         break;
        //     case "4":
        //         System.out.println("THURSDAY");
        //         break;
        //     case "5":
        //         System.out.println("FRIDAY");
        //         break;
        //     case "6":
        //         System.out.println("SATURDAY");
        //         break;
        //     case "7":
        //         System.out.println("SUNDAY");
        //         break;
        //     default:
        //         System.out.println("Invaild Number!");
        //         break;
        // }

        // System.out.print("Enter a year: ");
        // int year = sc.nextInt();

        // if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
        //     System.out.println("It's a Leap year.");
        // }
        // else{
        //     System.out.println("It's not a Leap year.");
        // }

        // check Website for it's url.

        // System.out.print("Enter your website name:");
        // String web = sc.next();

        // if(web.endsWith(".com")){
        //     System.out.println("This is a Commercial Website.");
        // }
        // else if(web.endsWith(".org")){
        //     System.out.println("This is a Orgnaizational Website.");
        // }
        // else if(web.endsWith(".in")){
        //     System.out.println("This is a Indain Websitwe.");
        // }
        // else{
        //     System.out.println("Invaild Enter!");
        // }

        // Month name print

        System.out.print("Enter a number (1-12): ");
        String month = sc.next();

        switch (month) {
            case "1" -> System.out.println("Jan");
            case "2" -> System.out.println("Feb");
            case "3" -> System.out.println("Mar");
            case "4" -> System.out.println("Apr");
            case "5" -> System.out.println("May");
            case "6" -> System.out.println("Jun");
            case "7" -> System.out.println("Jul");
            case "8" -> System.out.println("Aug");
            case "9" -> System.out.println("Sep");
            case "10" -> System.out.println("Oct");
            case "11" -> System.out.println("Nov");
            case "12" -> System.out.println("Dec");
            
            default -> System.out.println("Invaild Enter!");
                
        }
    }
}
