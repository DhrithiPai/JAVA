import java.util.Scanner;
class Circle 
{
    float r;
    Circle(float rad)
    {
        r=rad;
    }
    float area()
    {
        return (float)(3.14*r*r);
    }
}
class Sector extends Circle 
{
    float angle;
    Sector(float rad,float ctrl)
    {
        super(rad);
        angle=ctrl;

    }
    float area()
    {
        return (float)(0.5*r*r*angle);
    }
}
class Segment extends Circle 
{
    float l;
    Segment(float rad,float len)
    {
        super(rad);
        l=len;

    }
    float area()
    {
        return (float)(r*r*((r-l)/r)-(r-l)*Math.pow(2*r*l-l*l,0.5));
    }
}
public class CircleDriver 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter radius of circle : ");
        float rad=sc.nextFloat();
        Circle c=new Circle(rad);
        System.out.println("Area of circle is : "+c.area());
        System.out.print("Enter control angle of sector in radians : ");
        float ctrl=sc.nextFloat();
        Sector sec=new Sector(rad,ctrl);
        System.out.println("Area of Sector is : "+sec.area());
        System.out.print("Enter length of segment : ");
        float len=sc.nextFloat();
        Segment seg=new Segment(rad,len);
        System.out.println("Area of Segment is : "+seg.area());
        sc.close();

    }
    
}
