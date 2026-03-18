import java.io.*;
class leap{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year;
        System.out.println("Enter the year -->");
        year = Integer.parseInt(br.readLine());
        if(year % 400 == 0)
        System.out.println("This is a leap year.");
        else
        System.out.println("This is not leap year.");

    }
}