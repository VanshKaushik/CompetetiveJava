public class Ugly {
    public static void main(String args[])
    {
        int n =8;
        int ugly[] = new int [n];
        int c2=0,c3=0,c5=0;
        int n2=2;
        int n3=3;
        int n5 =5;
        int nu =1;
        ugly[0]=1;
       
        for(int i=1;i<n;i++)
        {
         nu=(Math.min(n2,(Math.min(n3,n5))));
         ugly[i]=nu;
         if(nu==n2)
         {
            c2=c2+1; 
            n2=ugly[c2]*2;
         }
         if(nu==n3)
         {
             c3=c3+1;
             n3=ugly[c3]*3;
         }
         if(nu==n5)
         {
                c5=c5+1;
                n5=ugly[c5]*5;
         }
        }
        System.out.println("Nth term ugly number is "+nu);
    }
    
}
