/*import java.util.*;

public class LLStrings 
{
    
    public static class Node
    {
        String data ;
        Node next;
        Node(String a , Node n)
        {
            data=a;
            next =  n;
        }
    }  
    
    static Node head=null;

    public static Node create(String s , Node e)
    {
        
        
        Node n=new Node(s,e);
        
        return n;
    }

    public static void insertBegin(String s)
    {
        if(head==null)
        {
            head=create(s, null);
        }
        else
        {
            Node n=create(s,head);            
            head=n;
        }

    }
    public static void insertEnd(String s)
    {
        if(head==null)
        {
            head=create(s,null);
        }
        else
        {
            Node ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            Node n=create(s,null);            
            ptr.next=n;
        }

    }
    public static void insertMiddle(String s)
    {
        if(head==null)
        {
            head=create(s,null);
        }
        else
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Do you want to insert : \n 1. At position \n 2. After a string data \n 3. Before a string data ")
            int c=sc.nextInt();
            switch(c)
            {
                case 1 : System.out.print("Enter position at which to insert : ");
                        int pos=sc.nextInt();
                        Node ptr=head;
                        for(int i=0;i<pos-1;i++)
                        {
                            while(ptr!=null)
                            {
                                ptr=ptr.next;
                            }

                        }
                        if(ptr==null)
                        {
                            insertBegin(s);
                        }
                        else 
                        {
                            
                        }
            }
            Node ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            Node n=create(s,null);            
            ptr.next=n;
        }

    }

    public static void display()
    {
        Node ptr=head;
        System.out.println("Elements of linked list are:");
        while(ptr!=null)
        {
            System.out.print(ptr.data+ "\t");
            ptr=ptr.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            
            System.out.print(" 1. Insert begin \n 2. Insert End \n 3. Insert middle \n 4. Delete begin \n 5. Delete end \n 6. Delete middle \n 7. Display \n 8. Exit \n Enter choice : ");
            int ch = sc.nextInt();
            String s;
            switch(ch)
            {
                case 1 : System.out.print("Enter string data : ");    
                        sc.nextLine();    
                        s=sc.nextLine();
                        insertBegin(s);
                        break;

                case 2 : System.out.print("Enter string data : ");  
                        sc.nextLine();      
                        s=sc.nextLine();
                        insertEnd(s);
                        break;


                case 3 : System.out.print("Enter string data : ");  
                        sc.nextLine();      
                        s=sc.nextLine();
                        insertMiddle(s);
                        break;




                case 7 : display();break;

                case 8 : return;

                default : System.out.println("Invalid choice");
            }
        }
    }
}
*/