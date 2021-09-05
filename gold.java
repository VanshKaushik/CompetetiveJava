
public class gold
{
    public static void main(String args[])
    {
        int a[][]={ {1, 3, 1, 5},
                    {2, 2, 4, 1},
                    {5, 0, 2, 3},
                    {0, 6, 1, 2}
                };
        
        int n= 4;int m=4;int r=0;int rup=0;int rd=0;
        for(int i=m-2;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                r=a[j][i+1];
                rup=(j==0)? 0:a[j-1][i+1];
                rd=(j==n-1)?0:a[j+1][i+1];
                a[j][i]=a[j][i]+Math.max(r,Math.max(rup, rd));
            }
        }
        int g=a[0][0];
        for(int j=1;j<n;j++)
        {
            g=Math.max(g,a[j][0]);
        }
        System.out.println(g);
    }
    
}
