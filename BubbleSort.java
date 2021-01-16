import java.util.Scanner;

public class BubbleSort
{
    static int n,arr[];
    static void bubsort()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0; j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            } 
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        n=sc.nextInt();
        System.out.println("Enter array elements");
        arr=new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        bubsort();
        System.out.println("Sorted array is : ");
        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i] +"\t");

        }
        sc.close();
    }

}