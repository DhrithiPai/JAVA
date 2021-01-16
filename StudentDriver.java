import java.util.*; 

interface Student 
{
    void getstudentdetails();
}
class Subject 
{
    String name;
    int grade , credits ;
}
class creditLimit extends Exception 
{
    private static final long serialVersionUID=1L;
    int c;

    creditLimit(int a)
    {
        c=a;
    }

    public String toString()
    {
        return " Credit extends 30 ( ie " + c + ")";

    }

}
class RegisterStudent implements Student
{
    public String name , branch ,joinDate ;
    public int sem;
    public ArrayList<Subject> sub = new ArrayList<Subject>();
    Scanner sc= new Scanner(System.in);

    public void getstudentdetails()
    {
        System.out.print(" Enter name of Student : ");
        name=sc.nextLine();
        System.out.print(" Enter branch: ");
        branch=sc.nextLine();
        System.out.print(" Enter joining date: ");
        joinDate=sc.nextLine();
        System.out.print(" Enter Semester: ");
        sem=sc.nextInt();
        System.out.print(" Enter Number of subjects: ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            Subject s=new Subject();
            System.out.println(" Subject "+(i+1)+" details : ");
            System.out.print(" name: ");
            s.name=sc.nextLine();
            System.out.print(" grade: ");
            s.grade=sc.nextInt();
            System.out.print(" credits: ");
            s.credits=sc.nextInt();
            if(s.credits > 30)
            {
                creditLimit e = new creditLimit(s.credits);
                System.out.println(e);
            }
            sub.add(s);
        }

    }
}

class SGPAException extends Exception 
{
    private static final long serialVersionUID=1L;
    public int s;

    SGPAException(int a)
    {
        s=a;
    }

    public String toString()
    {
        return " SGPA extends 10 ( ie " + s + ")";

    }

}
class Result 
{
    public void display(ArrayList<Subject> sub) throws SGPAException
    {
        int creditsum=0,SGPA=0;
        for(int i=0;i<sub.size();i++)
        {
            creditsum+= sub.get(i).credits;
            SGPA+=sub.get(i).grade * sub.get(i).credits;


        }

        SGPA/=creditsum;

        if(SGPA > 10)
        {
            throw new SGPAException(SGPA);
        }
        else
        {
            System.out.println("SGPA : "+SGPA);
        }
        System.out.print("Grade : ");
        switch(SGPA)
        {
            case 10: System.out.println("S");break;
            case 9: System.out.println("A");break;
            case 8: System.out.println("B");break;
            case 7: System.out.println("C");break;
            case 6: System.out.println("D");break;
            
            case 4: System.out.println("E");break;
            case 0: System.out.println("F");break;

        }

    }
}
public class StudentDriver 
{
    public static void main(String args[])
    {
        RegisterStudent reg = new RegisterStudent();
        reg.getstudentdetails();
        Result r =new Result();
        try
        {
            
            r.display(reg.sub);
        }
        catch(SGPAException e)
        {
            System.out.println(e);
        }


    }
    
}
