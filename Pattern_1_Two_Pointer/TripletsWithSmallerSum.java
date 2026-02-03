// User function Template for Java
import java.util.Arrays;
class Solution {
  public static  long countTriplets(int n, int sum, long arr[]) 
  {
        
        Arrays.sort(arr);
        long count=0;
        for(int i=0;i<arr.length-2;i++)
        {
            int j=i+1;
            int k=arr.length-1;
            
            while(j<k)
            {
                long tem_sum=(arr[i]+arr[j]+arr[k]);
                if(tem_sum<sum)
                {
                    count += (k - j);
                    j++;
                }
                else
                {
                    k--;
                }
                
                
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        int n=18;
        int sum=86;
        long arr[]={30 ,8, 23, 6, 10, 9, 31, 7, 19, 20, 1, 33, 21, 27, 28, 3, 25, 26};
        System.out.println(countTriplets(n,sum,arr));
    }
}
