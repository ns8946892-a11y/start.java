import java.util.Scanner;
class Vowels{
    public static void main(String args[]){
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character.");
        ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
   
        switch(ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            System.out.println("Character is a vowel.");
            break;
            default :
            if(ch >= 'a' && ch <= 'z'){
                System.out.println("Character is a constants.");
            }
            else{
                System.out.println("Invaild input.");
            }
        }
        sc.close();
    }
}