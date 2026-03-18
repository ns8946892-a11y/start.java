import java.util.Scanner;
class vowel{
    public static void main(String args[]){   
      try(Scanner sc = new Scanner(System.in)){
      System.out.println("Enter a character: ");
      char ch = sc.next().charAt(0);
      ch = Character.toLowerCase(ch);

      if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o'|| ch == 'u') {
        System.out.println(ch +" is a vowel.");
      }
      else if((ch >='a' && ch <= 'z')){
        System.out.println(ch +" is a Consonat.");
      }
      else{
        System.out.println("Invaid input! please enter an alphabet.");
       }
      }
    }
}