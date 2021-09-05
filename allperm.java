
public class allperm {
    

    void perm(String s,int l,int r)
    {
        if(l==r)
        {
            System.out.println(s);
        }
        else
        {
            for(int i=l;i<=r;i++)
            {
                s=swap(s,l,i);
                perm(s,l+1,r);
                s=swap(s,l,i);
            }
        } 
    }
    String swap(String str,int l,int i)
    {
        char temp;
        char ar[]= str.toCharArray();
        temp=ar[l];
        ar[l]=ar[i];
        ar[i]=temp;
         return (String.valueOf(ar)); 
    } 
    
    public static void main(String args[])
    {
        String s= "ABCD";
        int n=s.length();
        allperm permutation = new allperm();
        permutation.perm(s,0,n-1);
        
    }
    
}
