import java.util.*;
public class coin {
    static long countWays(int S[], int m, int n)
    {
        
        long[] table = new long[n+1];
        Arrays.fill(table, 0);   
        table[0] = 1;
        // In one we will subtract the coin value from the total value but we can use the coin again
        // I other we will not use the coinin the array and try to make the coin change with the other coin values.
        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];
 
        return table[n];
    }
 
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        System.out.println(countWays(arr, m, n));
    }
}
