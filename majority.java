import java.util.*;
public class majority 
{
    public static void main(String args[])
    {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };int k=0;
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap <>();
        for(int i=0; i<n ;i++)
        {
            if(map.get(arr[i]) != null)
            {
                k =  map.get(arr[i])+1;
                map.put(arr[i],k);
            }
            else
            {
                map.put(arr[i],1);
            }
        }  
        int value=n/2;int f=0;
        for(Integer j: map.keySet())
        {
            if(map.get(j)>value)
            {
                System.out.println(j+" with freq "+ map.get(j));
                f++;
            }
            
        }
        if(f==0)
        {
            System.out.println(-1);
        }

    }    
    

}
