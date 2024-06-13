public class move0toend {
    public static void printarray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println(" ");
    }
    public static  void move(int[]arr)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0 && arr[j]==0)
            {  int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }if(arr[j]!=0)
            j++;
        }
    }
    public static void main(String[]args)
    {
        int[]arr={1,0,3,3,0,4,2};
        printarray(arr);
      
        move(arr);
        printarray(arr);


    }
    
}
