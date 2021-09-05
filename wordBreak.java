public class wordBreak 
{   
    static boolean wordbreak(String s,String []d)
    {   int n= s.length();
        if(n==0)
        {
            return true;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<d.length;j++)
            {
                if(s.substring(0,i).equals(d[j])==true && wordbreak(s.substring(i,n),d))
                {
                   return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        String s="imobile";
        String D[]={ "i", "like", "sam",
        "sung", "samsung", "mobile",
        "ice","cream", "icecream",
        "man", "go", "mango" };
        System.out.println(wordbreak(s,D));
    } 
}
