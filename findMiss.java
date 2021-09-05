public class findMiss 
{
    public static void main(String args[])
    {
        int arr[] = { 5, 5, 4, 7, 3, 6, 2 };
        int n = arr.length;
        for(int i=0;i<n;i++)
        {    int abs_val = Math.abs(arr[i]);
            if(arr[abs_val - 1] > 0)
            {
                arr[abs_val - 1] = -arr[abs_val - 1];
            }
            else
                System.out.println(abs_val);
        }
    
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                System.out.println(i+1);
            }
        }
    }
}
