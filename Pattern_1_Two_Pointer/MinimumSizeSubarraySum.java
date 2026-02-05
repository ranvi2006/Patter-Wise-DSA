class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
     int min_len=Integer.MAX_VALUE;
    int low=0;
    int high=0;
    int sum=0;
    while(high<nums.length)
    {
        sum+=nums[high];
        while(sum>=target && low<=high)
        {

            if(min_len>(high-low)+1)
            {
              min_len=(high-low)+1;
            }
            sum-=nums[low];
            low++;
        }
        high++;
    }
    if(min_len==Integer.MAX_VALUE)
    {
        return 0;
    }
    return  min_len;
}
    public static void main(String args[])
    {
        int nums[]={5,1,3,5,10,7,4,9,2,8};
        int target=15;
        System.out.println(minSubArrayLen(target,nums));
    }

}