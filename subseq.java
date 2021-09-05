public class subseq 
{
    
    static void findseq(String s,String ans,int i,int n)
    {
        if(i==n){System.out.println(ans);}
        else
        {
            findseq(s,ans,i+1,n);
            ans=ans+s.charAt(i);
            findseq(s,ans,i+1,n);
        }
    }
    public static void main(String args[])
    {
        String s ="abcd";
        int n=s.length();
        findseq(s,"",0,n);
    }    
}
