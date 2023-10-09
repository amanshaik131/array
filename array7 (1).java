//maximum element of an array
import java.util.Scanner;
class array7
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
      int max=a[0];
      for(int i=1;i<n;i++)
        {
          if(a[i]>max)
          {
            max=a[i];
          }
        }
      System.out.println("the maximum element of an array is "+max);
    }
  }