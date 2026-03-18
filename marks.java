import java.io.*;
class marks{
    public static void main(String args[])throws IOException
    {
        int marks;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your marks:");
        marks = Integer.parseInt(br.readLine());

        if(marks >= 40)
            System.out.println("PASS");
            else
            System.out.println("FAIL");
        }
    }
