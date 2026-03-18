import java.util.Scanner;
public class calculater {

    public static void main(String args[]){
       try (Scanner sc = new Scanner(System.in)){
        int month,year;
        System.out.print("Enter month (1-12) ");
        month =sc.nextInt();
        System.out.print("Enter year ");
        year = sc.nextInt();

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println("This month has 31 days.");
            break;

            case 4: case 6: case 9: case 11:
            System.out.println("This month has 30 days.");
            break;

            case 2:
            if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
                System.out.println("This month has 29 days. (Leap year)");
            }
            else {
                System.out.println("This month has 28 days.");
            }
            break;

            default:
            System.out.println("Invaild month number! please enter month between(1-12)");
         }
       }
    }
}