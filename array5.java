//reverse the array method 1
import java.util.Scanner;
class array5
  {
    public static void main(String args[])
    {
      System.out.println("enter the size of an array ");
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          System.out.printf("enter the value of a[%d]",i);
          Scanner sc=new Scanner(System.in);
          a[i]=sc.nextInt();
        }
      for(int i=n-1;i>=0;i--)
        {
          System.out.print(a[i]+" ");
        }
      
    }
  }