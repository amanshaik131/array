import java.util.Scanner;
class array3
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
      for(int i=0;i<n;i++)
        {
         sum=sum+a[i];
          if(a[i]%2==0)
          {
             sume=sume+a[i];
          }
          else
          {
            sumo=sumo+a[i];
          }
        }
      System.out.println("the sum of all values are "+sum);
      System.out.println("the sum of all even values are "+sume);
      System.out.println("the sum of all odd values are "+sumo);
    }
  }