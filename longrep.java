public class longrep {
    public static void main(String arg[])
    {
        String S = "axxxyaaak";
        String w= "";
        int n=S.length();
        w=w+S;
        char[] X=S.toCharArray();
        char[] Y=w.toCharArray();
        int L[][] = new int [n+1][n+1];
       
        for(int i=0; i<=n; i++)
        {
            for (int j=0; j<=n; j++)
            {
            if (i == 0 || j == 0)
                L[i][j] = 0;
            else if (X[i-1] == Y[j-1] && i!=j)
                L[i][j] = L[i-1][j-1] + 1;
            else
                L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
        System.out.println(L[n][n]);

    }
    
}
