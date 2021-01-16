import java.util.Scanner;

public class fibwithout 
{
    public static void fibw(int n)
    {
        int a=0,b=1,sum;
        for(int i=0;i<n;i++)
        {
            System.out.print(a+"\t");
            sum=a+b;
            b=a;
            a=sum;

        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of fibonacci terms to be printed");
        int n=sc.nextInt();
        fibw(n);
        sc.close();
    }
    
}
