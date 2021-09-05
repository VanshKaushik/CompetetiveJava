public class SubSum 
{
    public static void main(String args[])
    {
        int a[] = new int[8];
        a[0] =-2;  
        a[1] =-3;  
        a[2] = 4;  
        a[3] =-1;  
        a[4] =-2;
        a[5] = 1;
        a[6] = 5;
        a[7] =-3;
        int cs = 0;
        int ms = 0;
        for(int i=0;i<8;i++)
        {
            cs = cs + a[i];
            if(cs > ms)
            {
                ms=cs;
            }
            if(cs<0)
            {
                cs=0;
            }
        }
        System.out.println("Maximum sum of subarray is: "+ms);
    }
}
