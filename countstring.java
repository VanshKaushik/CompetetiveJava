public class countstring 
{
    int solve(int i, int j,String s, String str[], int size, int idx)
    {
        int found =0;
        if(i>=0 && j>=0 && i<6 && j<6 && s.charAt(idx)==str[i].charAt(j))
        {
            char temp = s.charAt(idx);
           str[i]=str[i].substring(0,j)+"0"+str[i].substring(j);
            idx+=1;
            if (idx == size)
            {
                found =1;
            }
            else
            {
                found+=solve(i+1,j,s,str,size,idx);
                found+=solve(i-1,j,s,str,size,idx);
                found+=solve(i,j+1,s,str,size,idx);
                found+=solve(i,j-1,s,str,size,idx);
            }
            str[i]=str[i].substring(0,j)+temp+str[i].substring(j);

        }
        return found;
    }

    public static void main(String args[])
    {   countstring obj = new countstring();
        String needle = "MAGIC";
        String input[] = { "BBABBM", "CBMBBA",
                           "IBABBG", "GOZBBI",
                           "ABBBBC", "MCIGAM" };
        String str[] = new String[input.length];
        int i;int ans=0;;
        for(i = 0; i < input.length; ++i)
        {
            str[i] = input[i];
        }
        int size = needle.length();
        for(i=0;i<6;i++)
        {
            for (int j=0;j<6;j++ )
            {
                ans += obj.solve(i,j,needle,str,size,0);
            }
        }
        System.out.println(ans);
    }    

}
