public class countStringgrid 
{   
    static int R,C;
    int solve(int i, int j, String s, char str[][],int size,int idx, char d)
    {
        int found =0;
        if(i>=0 && j>=0 && i<6 && j<6 && s.charAt(idx)==str[i][j])
        {
            char temp = s.charAt(idx);
            str[i][j]='0';
            idx+=1;
            if(idx == size)
            {
                found =1;
            }
            else
            {
                if(idx==0)
                {
                    found+=solve(i+1,j,s,str,size,idx,'d');
                    found+=solve(i-1,j,s,str,size,idx,'u');
                    found+=solve(i,j+1,s,str,size,idx,'r');
                    found+=solve(i,j-1,s,str,size,idx,'l');
                    found+=solve(i-1,j-1,s,str,size,idx,'w');
                    found+=solve(i+1,j+1,s,str,size,idx,'x');
                    found+=solve(i+1,j-1,s,str,size,idx,'y');
                    found+=solve(i-1,j+1,s,str,size,idx,'z');
                }
                else{
                    if(d=='d')found+=solve(i+1,j,s,str,size,idx,'d');
                    if(d=='u')found+=solve(i-1,j,s,str,size,idx,'u');
                    if(d=='l')found+=solve(i,j-1,s,str,size,idx,'l');
                    if(d=='r')found+=solve(i,j+1,s,str,size,idx,'r');
                    if(d=='w')found+=solve(i-1,j-1,s,str,size,idx,'w');
                    if(d=='x') found+=solve(i+1,j+1,s,str,size,idx,'x');
                    if(d=='y')found+=solve(i+1,j-1,s,str,size,idx,'y');
                    if(d=='z')found+=solve(i-1,j+1,s,str,size,idx,'z');
                }
                str[i][j]=temp;
                
            }
            

        }
        return found;
    }

    public static void main(String a[])
    {
        countStringgrid obj =new countStringgrid();
        String needle = "GEEKS";char d = 'd';
        int size =needle.length();
        R = 3;
        C = 13;
        int ans=0;
        char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                          { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                          { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<13;j++)
            {
                ans = obj.solve(i,j,needle,grid,size,0,d);
            }
        }

        System.out.println(ans);
    }   
}
