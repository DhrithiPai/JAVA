import java.util.Scanner;

public class CompareStrings 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        
        String s1=sc.nextLine();

        System.out.print("Enter another string : ");
        
        String s2=sc.nextLine();

        sc.close();
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.print("Strings are equal");

        }
        else
        {
            System.out.print("Strings are not equal");
        }
        
        

    }
    
}
