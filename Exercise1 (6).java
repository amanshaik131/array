//  Write a program to print the elements of an array present on even position
class Exercise1 {

	public static void main(String args[]) 
  {
     int arr[]={10,20,30,40,50};
    for(int i=0;i<arr.length;i++)
      {
        if(i%2==0)
        {
        System.out.print(arr[i]+" ");
        }
      }
		    
   }
}
