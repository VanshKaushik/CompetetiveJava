public class nextperm 
{
    
    public static void main (String args[])
    {
        int a[]={1,2,3,6,5,4};
        int n= a.length;
        int id =-1;
        for(int i=n-1;i>0;i--)
        {
            if(a[i] > a[i-1])
            {
                id=i;
                break;
            }
        }
        int t;
        if (id == -1)
        { //Resverse an array
            for(int j=0;j<n;j++)
            {
                t = a[j];
                a[j] = a[n - j - 1];
                a[n - j - 1] = t;
            }
            
             for(int i=0;i<n;i++)
                System.out.println(a[i]);
        }
        else
        {
            int prev=id;
            for(int i= id+1;i<n;i++)
            {
                if(a[i]>a[id-1]&& a[i]<=a[prev])
                {
                    prev=i;
                }
            }
            int l=a[prev];
            a[prev]=a[id-1];
            a[id-1]=l;
            int[] b = new int[n];
            int j = n;
            for (int i = 0; i < n; i++) 
            {
                if(i<id)
                {
                    b[i]=a[i];
                }
                else
                {
                    b[j - 1] = a[i];
                    j = j - 1;
                }
            
            }
            
        for(int i=0;i<n;i++)
        System.out.println(b[i]);

   
        }
        
    }    
}
