// Complete and execute java Program for finding smallest/minimum element in a single dimensional array
class Sample1 {

	public static void main(String args[]) {

		//Initialize array  
        	int [] arr = new int [] {25, 11, 7,75, 56};  

        	//Initialize min with first element of array.  
        	int min = arr[0];  

        	//Loop through the array  
        	for (int i=1;i<arr.length;i++)
            {  

            	//Compare elements of array with min  
           	if(arr[i]<min)
            {
              min=arr[i];
            }
               	//Write code to store in min if array element is less than it.   
        }  
        System.out.println("Smallest element present in given array: " + min);  
   }
}
