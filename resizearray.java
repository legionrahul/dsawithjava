public class resizearray {
    public static  int[] resize(int[]arr)
    {     
        int []temp=new int[arr.length*2];
        for(int i=0;i<arr.length;i++)
        { 
            temp[i]=arr[i];
            
        }
        return temp;

        
    }
    public static void main(String[]args)
    {
        int[]arr={1,2,3,4,5};
        System.out.println(arr.length);
         arr=resize(arr);
         System.out.println(arr.length);


    }
    
}
