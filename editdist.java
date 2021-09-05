

public class editdist 
{
    static void EditDistDP(String str1, String str2)
    {
        int l1=str1.length();
        int l2=str2.length();
        int dp[][] = new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(i==0) dp[i][j]=j;
                else if(j==0) dp[i][j]=i;
                else if(str1.charAt(i-1) == str2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = 1 + Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                }
            }
        }
        System.out.println(dp[l1][l2]);

    } 
    public static void main(String arg[])
    {
        String str1 = "food";
        String str2 = "money";
        EditDistDP(str1, str2);
    }    
}
