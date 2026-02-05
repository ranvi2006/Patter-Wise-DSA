class Solution {
    public static int maxSubarraySum(int[] arr, int k) {
        // Code here
        int max=Integer.MIN_VALUE;
        int sum=0;
        int low=0;
        
        
        for(int i=low;i<k;i++)
        {
            sum+=arr[i];
        }
        
       for(int high=k;high<arr.length;high++)
       {
        sum=(sum-arr[low])+arr[high];
        low++;
        if(sum>max)
        {
            max=sum;
        }
       }
       {

       }
        return max;
        
    }


    public static void main(String args[])
    {
        int arr[]={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        System.out.println("maximum sum : "+maxSubarraySum(arr,k));
    }
}