public class rotation {
    
    public static void main (String[] args)
    {
        String str1 = "AACD";
        String str2 = "ACDA";
        if ((str1.length() == str2.length()) &&((str1 + str1).indexOf(str2) != -1))
        {
            System.out.println("Strings are rotations of each other");
        }
    }
}
