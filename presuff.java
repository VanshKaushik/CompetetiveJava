public class presuff 
{
    public static void main(String args[])
    {
        String s ="abkhab";
        int n=s.length();
        String t="";
        String w= "";
         w=s+s;
        for(int i=0;i<n;i++)
        {   
            if(w.substring(n,n+i).equals(w.substring(n-i,n)))
            {
                t=w.substring(n,n+i);

            }

        }
        System.out.println(t);
    }   
}
