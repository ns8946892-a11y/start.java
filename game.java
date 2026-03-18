import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        /* user = 0 && com = 2 
           user = 2 && com = 1
           user = 1 && com = 0
        */
       
       for(int i = 1;i <= 3;i++){
           System.out.println("Enter Number ->\nRock For 0\nPaper For 1\nScissor For 2");
           System.out.println("Enter Number");
           int userinput = sc.nextInt();

        int rnum = r.nextInt(3);
        System.out.println(rnum);


        if(userinput == rnum){
            System.out.println("--Round Draw--");
        }
        else if(userinput == 0 && rnum == 2 || userinput == 1 && rnum == 0 || userinput == 2 && rnum == 1){
            System.out.println("---User Win---");
        }
        else{
            System.out.println("---Computer Win---");
        }

        
        switch (rnum) {
            case 0 -> System.out.println("Computer choice is 0(ROCK).");
            case 1 -> System.out.println("Computer choice is 1(PAPER).");
            case 2 -> System.out.println("Computer choice is 2(SCISSORS).");
            default -> System.out.println("Invilad Choice!\n\n"); 

            
            }
        }
    }
}
