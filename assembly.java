public class assembly {
    public static void main(String args[])
    {   int n=4;
        int a[][] = {{4, 5, 3, 2},
                    {2, 10, 1, 4}};
        int t[][] = {{0, 7, 4, 5},
                    {0, 9, 2, 8}};
        int e[] = {10, 12}, x[] = {18, 7};
        a[0][0] = a[0][0]+e[0];
        a[1][0]= a[1][0]+e[1];
        a[0][3]=a[0][3]+x[0];
        int r;
        int rd;
        a[1][3]=a[1][3]+x[1];
        for(int col=n-2;col>=0;col--)
        {
            for(int row=0;row<2;row++)
            {
                r=a[row][col+1];
                rd=a[(row+1)%2][col+1]+t[row][col+1];
                a[row][col]=a[row][col]+Math.min(r,rd);

            }

        }
        int s= Math.min(a[0][0],a[1][0]);
        System.out.println(s);
        
        
    }
    
}
