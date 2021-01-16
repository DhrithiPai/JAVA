import java.util.Scanner;

public class Extract 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        
        String str=sc.nextLine();
        System.out.print("Enter start position of string to be extracted (base 1): ");
        int n=sc.nextInt();
        System.out.print("Enter length of string to be extracted : ");
        int m=sc.nextInt();
        System.out.print("Extracted string : " + str.substring(n-1,n-1+m));
        sc.close();

    }
    
}
