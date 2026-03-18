import java.util.Scanner;
class week{
    public static void main(String args[]){
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in between (1-7).");
        days = sc.nextInt();

        switch (days) {
            case 1:
                System.out.println("Mondays.");                
                break;
            case 2:
                System.out.println("Tuesday.");
                break;
            case 3:
                System.out.println("Wednesday.");
                break;
            case 4:
                System.out.println("Thursday.");
                break;
            case 5:
                System.out.println("Friday.");
                break;
            case 6:
                System.out.println("Saturday.");
                break;
            case 7:
                System.out.println("Sunday.");
                break;
            default:
                break;
        }
        sc.close();
    }
}