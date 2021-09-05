public class countsq 
{
    public static void main(String args[])
    {
        int n =2;int c=1;
        for(int i=n-1;i>1;i-- )
        {
            for(int j =2;j<i;j++)
            {
                if(i%j==0 && i/j ==j)
                {
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }    
}
