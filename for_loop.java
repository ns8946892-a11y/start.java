class for_loop{
    public static void main(String args[]){
     
        // 1.Print number in reverse order.
    //  for(int i = 10;i >= 1;i--){
    //     System.out.println(i);
    //  }  

        // 2.Print even no. from 1 to 20.
        
        // for(int i = 1;i <= 20;i = i + 2){

        //     System.out.println(i + 1);
        // }

        // 3.Print Odd no. from 1 to 20.

        // for(int i = 1;i < 19;i = i + 2){
        //     System.out.println(i+2);
        // }

        // 4.Print Table.
        // int n = 10;
        // for(int i = 1;i <= 10;i++){
        //     System.out.println(n +" X "+ i +" = "+(n * i));
        // }

        // 5.Find sum of first N numbers.

        // int n = 3; 
        // int sum = 0;
        // for(int i = 1;i <= n;i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        // 6.Find factorial of a number.

        // int fact = 1;
        // int n = 10;
        // for(int i = 1;i <= n;i++){
        //     fact = fact * i;
        // }
        // System.out.println("Factorial is : " +fact);

        // 7.Count number of digits in a number.

        // int count = 0;
        // int num = 1000;
        // for(int i = 1;num > 0;i++){
        //     num = num / 10;
        //     count = count + 1;
        // } 
        // System.out.println(+count);

        // 8. Reverse a number

        // int rev = 0;
        // int digit = 0;
        // int num = 1234;
        // for(int i = 0;num > 0;i++){
        //     digit = num % 10;
        //     num = num / 10;
        //     rev = digit + rev * 10;
        // }
        // System.out.println(rev);

        // 9. Check whether number is palindrome or not.

        // int rev = 0;
        // int num = 121;
        // int temp = num;
        // int digit = 0;
        // for(int i = 0;num > 0;i++){
        //     digit = num % 10;
        //     num = num / 10;
        //     rev = digit +  rev * 10;
        // }
        // System.out.println(rev);
        // if(rev == temp){
        //     System.out.println("Number is palindrome : "+rev);
        // }
        // else{
        //     System.out.println("Number is not palindrome! ");
        // }

        // 10.Find sum of digits of a number.

        // int num = 1234;
        // int sum = 0;
        // int digit = 0;
        // for(int i = 0;num > 0;i++){
        //     digit = num % 10;
        //     num = num / 10;
        //     sum = digit + sum;
        // }
        // System.out.println(sum);

        // 11. Find product of digits.

        // int product = 1;
        // int num = 42;
        // int digit = 1;
        // for(;num > 0;num = num / 10){
        //     digit = num % 10;
        //     product = digit * product;
        // }
        // System.out.println(product);

        // 12.Find largest digit in a number.

        // int digit = 0;
        // int large = 0;
        // int num = 8976;
        // for(;num > 0;num = num / 10){
        //     digit = num % 10;
        
        //     if(digit > large){
        //         large = digit;
        //     } 
        // }
        // System.out.println("Largest number is : "+large);

        // 13.Find smallest digit in a number.

        int num = 8976;
        int digit =  0;
        int small  = 9;
        for(;num > 0;num = num / 10){
            digit = num % 10;

            if(digit < small){
                small = digit;
            }
        }
        System.out.println("Smallest number is : "+small);
    }
}