public class selectionshort {
    public static void main(String[]args)
    {
        int arr[]=new int[]{5,4,6,9,1};
        int smallest =arr[0];
        
        
        for(int i=0;i<arr.length-1;i++)
        for(int j=i+1;j<arr.length;j++)
        {
        if(arr[i]<=smallest)
    {
         smallest=j;
         
    }
    int temp=smallest;
    smallest=arr[i];
    arr[i]=temp;
   
     
        
 

        
      
        }
        
         
         


        

    }
    
}
