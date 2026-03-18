import java.util.Scanner;
class check {
    public static void main(String args[]){
        int num;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enetr the number: ");
        num = sc.nextInt();
        if(num > 1)
        System.out.println("Number is positive: "+num);
        else if(num < 1)
        System.out.println("Number is neagative: "+num);
        else
        System.out.println("Number us zero");
        }
    }
}