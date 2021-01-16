import java.util.*;



public class StringQueue 
{
    static ArrayList<String> str = new ArrayList<String>();

    static void enqueue(String e)
    {
        str.add(e);
    }

    static void dequeue()
    {
        if(str.size()==0)
        {
            System.out.println("Queue is empty , no Strings to dequeue");
        }
        else
        {
            System.out.println( str.get(0)+ " dequeued ");
            str.remove(0);
        }

    }

    static void peek()
    {
        if(str.size()==0)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("First String in queue is : " + str.get(0));
        }
    }

    static void display()
    {
        if(str.size()==0)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Elements of Queue are :");
            for(int i=0;i<str.size();i++)
            {
                System.out.print(str.get(i) +"\t");
            }
            System.out.println();
        }
    }



    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        while(true)
        {
            
            System.out.print(" 1. Enqueue \n 2. Dequeue \n 3. Peek \n 4. Display \n 5. Exit \n Enter your choice : ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1: System.out.print("Enter string to be enqueued : ");
                        sc.nextLine();
                        String e = sc.nextLine();
                        enqueue(e);
                        break;

                case 2 : dequeue();break;

                case 3 : peek();break;

                case 4 : display();break;

                case 5 : return;

                default : System.out.println("Invalid choice");break;


            }

        }
        
    }
}
