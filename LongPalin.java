public class LongPalin 
{   
    public static void main(String args[])
    {
        String S = "forgeeksskeegfor";
        int n = S.length();
         
     
        boolean table[][] = new  boolean[n][n];
        int max = 1;
        for(int i=0;i<n;i++)
        {
            table[i][i] = true;
        }
        int start=0;
        for(int i=0; i<n-1 ; i++)
        {
            if(S.charAt(i) == S.charAt(i+1))
            {
                table[i][i+1] = true;
                start = i;
                max = 2;
            }
        }
        for(int k = 3; k < n+1; k++)
        {
            for(int i= 0; i<n-k+1; i++)
            {
                int j = i+k-1; 
                
                if(table[i+1][j-1] == true && S.charAt(i)==S.charAt(j))
                {
                    table[i][j] = true;
                    if(k > max)
                    {
                        start = i;
                        max = k;
                    }
                }
            }
        }
        if(max==1)
        {
            System.out.println(S.substring(0,1)); 
        }
        if(max==2)
        {
            for(int i=0;i<n;i++)
            {
                if(S.charAt(i)==S.charAt(i+1))
                {
                    System.out.println(S.substring(i,i+2));
                }
            }
        }
        
        System.out.println("Longest palindrome is: "+S.substring(start,start+max));
    }
    
}
