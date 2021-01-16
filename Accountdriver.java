import java.util.Scanner;


class Account
{
    int Accno,PhoneNo;
    String name;
    float balance_amt;
    Scanner sc=new Scanner(System.in);
    void getinput()
    {
        System.out.print("Enter your Name:");
        name=sc.nextLine();
        System.out.print("Account number :");
        Accno=sc.nextInt();
        System.out.println("Phone number : ");
        PhoneNo=sc.nextInt();
        System.out.print("Balance amount : ");
        balance_amt=sc.nextFloat();
    }
    void deposit(float m)
    {
        balance_amt+=m;
        System.out.println("Deposited " + m +"\n Current balance= "+balance_amt);
    }
    void withdraw(float w)
    {
        if(w>balance_amt)
        {
            System.out.println("Insufficient balance : "+balance_amt);
            return;
        }
        balance_amt-=w;
        System.out.println(w+ " Withdrawn \n Current balance = "+balance_amt);
    }
    void print()
    {
        System.out.println("Name : "+name+"\nAccount number : "+Accno+"\nPhone number : "+PhoneNo+"\nBalance amount : "+balance_amt);
    }
}
public class Accountdriver 
{
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String args[])
    {
        
        Account a=new Account();
        
        a.getinput();
        while(true)
        {
            System.out.println(" 1. Deposit \n 2. Withdraw \n 3. Exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter amount to be deposited");
                a.deposit(sc.nextFloat());
                break;

                case 2 : System.out.println("Enter amount to be withdrawn");
                a.withdraw(sc.nextFloat());
                break;

                case 3 : return;
            }

        }
        
        
    }

    
}
