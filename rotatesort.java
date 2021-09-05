public class rotatesort 
{
    static int pivotedBinarySearch(int arr[],int n,int key)
    {
        int pivot = pivot(arr,0,n-1);
        if(pivot ==-1)
        {
            return binarysearch(arr,0,n-1,key);
        }
        if(arr[pivot]==key)
        {
            return pivot;
        }
        if(arr[0]<=key) return binarysearch(arr,0,pivot-1,key);
        else  return binarysearch(arr,pivot+1,n-1,key);

    }
    static int pivot(int arr[], int low, int high)
    {
        if(high<low)return -1;
        if(high == low) return low;
        int mid = (high + low)/2;
        if(mid < high  && arr[mid]>arr[mid+1] ) return(mid);
        if(mid>low && arr[mid-1]> arr[mid]) return (mid-1);
        if(arr[low]>=arr[mid]) return pivot(arr,low,mid-1);
        else return pivot(arr,mid+1,high);
    }
    static int binarysearch(int arr[], int low,int high,int key)
    {
        if(high<low)
        {
            return -1;
        }
        int mid =(low +high)/2;
        if(key ==arr[mid])
        {
            return mid;
        }
        if(key>arr[mid])
        {
            return binarysearch(arr,mid+1,high,key);

        }
        return binarysearch(arr,low,mid-1,key);
    }
    public static void main(String args[])
    {
        int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr1.length;
        int key = 6;
        System.out.println("Index of the element is : "+ pivotedBinarySearch(arr1, n, key));
    }    
}
