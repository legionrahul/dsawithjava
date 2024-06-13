public class secondmaxvalue {
    public static  int secondmax(int []arr)
    {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            { 
                secondmax=max;
                max=arr[i];

            }else if(arr[i]>secondmax && arr[i]!=max)
            {
                secondmax=arr[i];
            }
           
        }
        return secondmax;
    }
    public static void main(String[]args)
    {
        int []arr={1,2,5,5,3,0};
        int result=secondmax(arr);
        System.out.println(result);


    }
    
}
