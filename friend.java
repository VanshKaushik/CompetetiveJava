public class friend {
    public static void main(String a[])
    {   int n=3;
        long dp[] = new long [5];

         dp[0]=0;
         dp[1]=1;
         dp[2]=2;
         for(int i=3;i<=n;i++)
         {
             dp[i]=dp[i-1] + (i-1)*dp[i-2];
         }
         System.out.println( dp[n]);

    }
    
}
