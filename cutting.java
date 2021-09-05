


public class cutting 

{
    public static void main(String a[])
    {
        int arr[] = new int[] {1,5,8,9,10,17,17,20};
        int n = arr.length;
        
        int dp[] = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                    dp[j]=Math.max(dp[j],arr[i-1]+dp[j-i]);
            }
        }
        System.out.println(dp[n]);

    }   
}
