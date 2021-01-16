import java.util.Scanner; 

class Complex 
{
    float r1,r2,im1,im2;
    Scanner sc=new Scanner(System.in);
    Complex()
    {
        System.out.print("Enter real part of 1st complex number : ");
        r1=sc.nextFloat();
        System.out.print("Enter imaginary part of 1st complex number : ");
        im1=sc.nextFloat();
        System.out.print("Enter real part of 2nd complex number : ");
        r2=sc.nextFloat();
        System.out.print("Enter imaginary part of 2nd complex number : ");
        im2=sc.nextFloat();
        
    }
    void add()
    {
        System.out.println("Sum of the complex numbers is : "+ (r1+r2)+" + i ( "+ (im2+im1)+" )");
    }
    void sub()
    {
        System.out.println("Subtraction of the complex numbers is : "+ (r1-r2)+" + i ( "+ (im1-im2)+" )");
    }
    void mul()
    {
        float real=r1*r2 - im1*im2;
        float imag= r1*im2 + r1*im1;
        System.out.println("Product of the complex numbers is : "+ real +" + i ( "+ imag+" )");
    }

}
public class ComplexDriver 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        
        Complex c= new Complex();
        while(true)
        {
            
            System.out.print(" 1. Add \n 2. Subtract\n 3. Multiply \n 4. Exit \n Enter choice : ");
            int ch=sc.nextInt();
            
            
            switch(ch)
            {
                case 1: c.add();break;
                case 2 : c.sub();break;
                case 3 : c.mul();break;
                case 4 : return;
                default : System.out.println("Invalid choice");break;

            }
            

        }    
        
        
        
    }

    
}
