public class removeeveninterger {
    public static void printarray(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
    public static int[] remove(int[]arr)
    {
        int oddcount=0;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i] % 2 != 0)
        oddcount++;
        }
  int[] result=new int[oddcount];
  int indx=0;
  for(int i=0;i<arr.length;i++)
  {
    if(arr[i]%2!=0)
    {
    result[indx]=arr[i];
    indx++;
    }
  }
return result;
    }
    public static void main(String[]args)
    {
        int []arr={2,3,4,6,8,9};
        printarray(arr);
       int resut[]= remove(arr);
       System.out.println("reverse");
        printarray(resut);
    }

    
}
