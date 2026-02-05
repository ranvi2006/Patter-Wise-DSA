class Solution {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        long product=1;
        int count=0;
        int high=0;
        int low=0;
       while(high<nums.length)
       {
        product*=nums[high];
        while(product>=k && low<=high)
        {
            product/=nums[low];
            low++;
        }

        count+=(high-low)+1;
        high++;
       }
       return count;
    }

    public static void main(String args[])
    {
        int nums[]={10,5,20};
        int k=100;
        System.out.println(numSubarrayProductLessThanK(nums,k));
       
    }
}