public class SubSum2D 
{
    static int kadane(int c[],int row)
    {
        int cs = 0;
        int ms = 0;
        for(int i=0;i<row;i++)
        {
            cs = cs + c[i];
            if(cs > ms)
            {
                ms=cs;
            }
            if(cs<0)
            {
                cs=0;
            }
        }
        return ms;
    }
    public static void main(String args[])
    {
        int a[][] = { 
                      { 6,-5,-7, 4,-4 },
                      { 9, 3,-6, 5, 2 },
                      {-10,4, 7,-6, 3 },
                      {-8, 9,-3, 3,-7 } 
                    };
        int col,row;
        col=5;
        row=4;
        int ms=0;
        int ret = Integer.MIN_VALUE;
        for(int i=0;i<col;i++)
        {   int c[] = new int[row];
            for(int j=i;j<col;j++) // Traversing the matrix vertically
            {
                for(int k=0;k<row;k++)
                {
                    c[k] = c[k] + a[k][j];
                }
                ms = kadane(c,row);
                ret = Math.max(ret, ms);
            }
        }
        System.out.print(ret);
    }    
}
