import java.util.Scanner;
class array4
  {
    public static void main(String args[])
    {
      int sum=0,sume=0,sumo=0;
     System.out.println("enter the size of an array is ");
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          System.out.printf("enter the value of a[%d]",i);
          Scanner sc=new Scanner(System.in);
          a[i]=sc.nextInt();
        }
      
          System.out.println("the sum of first value and last value and middle value is "+(a[0]+a[n/2]+a[n-1]));
        
    }
  }