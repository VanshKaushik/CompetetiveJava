
public class Norep 
{
    public static void main(String args[])
    {
        String s = "geeksforgeeks" ;
        char z;
        String w="";
        int m =0;
        for(int i=0;i<s.length();i++)
        {
            w = w + s.charAt(i);
            for (int j = i+1 ; j <s.length();j++)
            {
                z = s.charAt(j);
                if(w.indexOf(z) == -1)
                {
                    w=w+z;

                }
                else
                {
                    m = Math.max(m,w.length());
                    i = j;
                    break;
                }
            }
            w ="";
        }
        System.out.println("The longest substring without recurring characters is "+m);
    }    
}

