import java.util.Scanner;
class array2
  {
    public static void main(String args[])
    {
   System.out.println("enter the size of array");
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
      
              System.out.printf("the element of a[%d]",i);
              Scanner sc=new Scanner (System.in);
           a[i]=sc.nextInt();
        }
      for(int i=0;i<n;i++)
        {
          System.out.printf("elements of array a[%d] ",i);
          System.out.println(a[i]);
       //   System.out.println();
        }
      
    }
  }