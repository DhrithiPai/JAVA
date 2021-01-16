import java.util.Scanner;
public class fibrec
{
    public static void fib(int n, int a , int b)
    {
        if(n!=0)
        {
            System.out.print(a+" \t ");
            fib(n-1,a+b,a);

        }
        
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of fibonacci terms to be printed");
        int n=sc.nextInt();
        fib(n,0,1);
        sc.close();
    }
    
}
