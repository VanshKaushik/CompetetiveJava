public class productarray
{
    public static void main(String arg[])
    {
         int nums[] = {10, 3, 5, 6, 2};
         int n = nums.length;int arr[] = new int[n];int p=1;

         for(int i=0;i<n;i++)
         {  
             p=p * nums[i];
         }
        for(int j=0;j<n;j++)
        {
            arr[j] =p /nums[j];
            System.out.println(arr[j]);
        }
             
             
         
    }
}    

