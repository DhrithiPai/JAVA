import java.util.Scanner;
class Matrix
{
    int r,c,arr[][];
    Scanner sc= new Scanner(System.in);


    Matrix()
    {
        System.out.println("Enter order of matrix ");
        r=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Enter elements of matrix ");
        arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }

    }
    public static void mul(Matrix m1, Matrix m2)
    {
        if(m1.c != m2.r)
        {
            System.out.println("Matrix multiplication not possible");
            
        }
        else
        {
            int r[][]=new int[m1.r][m2.c];
            System.out.println("Resultant Matrix after multiplication :  ");

            for(int i=0;i<(m1.r);i++)
            {
                for(int j=0;j<(m2.c);j++)
                {
                    int sum=0;
                    for(int k=0;k<(m1.c);k++)
                    {
                        sum+=m1.arr[i][k] * m2.arr[k][j];
                    }
                    r[i][j]=sum;
                    System.out.print(r[i][j]+ "\t");

                }
                System.out.println();
            }
            
            

        }
        
        

    }



}
public class MatrixDriver 
{
    public static void main(String args[])
    {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        Matrix.mul(m1,m2);

    }
    
}
