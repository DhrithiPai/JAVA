import java.util.*;

interface Department 
{
    void readdata();
    void printdata();
    void print_number_designations();
    void number_research_consultancy_projs();
}
class f 
{
    String name, designation,joining_date,subjects_handled;
    int  age,experience;
}

class ISE_Department implements Department 
{
    public List<f> fac=new ArrayList<f>();

    
    public void readdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of faculty members :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Details of " + (i + 1));
            f f=new f();
            System.out.print("Enter Name : ");
            sc.nextLine();
            f.name=sc.nextLine();
            
			System.out.println("Enter the age");
			f.age = sc.nextInt();
			System.out.println("Enter the years of experience");
			f.experience = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the designation");
			f.designation = sc.nextLine();
			System.out.println("Enter the joining date");
			f.joining_date = sc.nextLine();
			System.out.println("Enter the subjects handled with spaces ");
			f.subjects_handled = sc.nextLine();
			fac.add(f);
        }
        sc.close();

    }
    public void printdata()
    {

    }
    public void print_number_designations()
    {

    }
    public void number_research_consultancy_projs()
    {

    }
    
}
public class MainClass
{

}
class AgeException extends Exception 
{
    private static final long serialVersionUID=1L;
    private int a;
    AgeException(int age)
    {
        a=age;
    }
    public String toString()
    {
        return "Age > 58 : [" + a+ "]";
    }
}
