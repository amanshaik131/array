//reverse the array method 2
import java.util.Scanner;
class array6
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
      for(int i=0,j=n-1;i<n;i++,j--)
        {
          if(i<=j)
          {
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
         
          }
          
        }
    
      for(int i=0;i<n;i++)
        {
          System.out.print(a[i]);
        }
    }
  }