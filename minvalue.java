public class minvalue {


    public static int minvalue(int []arr)
    {    

         if(arr==null || arr.length==0){
         throw new IllegalArgumentException("invalid input");}

        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            min=arr[i];
        }
        return min;

        

    }
    public static void main(String[]args)
    {
        int []arr={1,2,34,53,6534,2,34};
        int minimumvalue=minvalue(arr);
        System.out.println(minimumvalue);
    }
    
}
