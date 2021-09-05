public class longpref 
{
    static String common(String str1,String str2)
    {
        String result="";
        int n1=str1.length();
        int n2=str2.length();
        for(int i=0, j=0; i<=n1-1 && j<=n2-1;i++,j++)
        {
            if(str1.charAt(i)!=str2.charAt(j))
            {
                break;
            }
            else
            {
                result+=str1.charAt(i);
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        String arr[] = {"geeksforgeeks", "geeks","geek", "geezer"};
        int n = arr.length;
        String prefix = arr[0];
 
        for (int i = 1; i <= n - 1; i++) 
        {
            prefix = common(prefix, arr[i]);
        }
 
        
        if(prefix.length()>0)
        {
            System.out.println("The longest common prefix is: "+prefix);
        }
        else
        {
            System.out.println("No common pre");
        }
    }    
}
