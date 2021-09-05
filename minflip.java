public class minflip 
{

    static int Flip(String str, char z)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) !=z)
            {
                count++;
            }
            z=(z == '0') ? '1' : '0';

        }return count; 
    }
    public static void main(String args[])
    {
        String str = "0001010111";
        System.out.println(Math.min(Flip(str, '0'),Flip(str, '1')));
    }
}
