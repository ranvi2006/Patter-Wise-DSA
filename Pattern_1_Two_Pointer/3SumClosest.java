import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
   Arrays.sort(nums);
        
         int mSum = nums[0] + nums[1] + nums[2];
         int closest = Math.abs(mSum - target);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }

            int j=i+1;
            int k=nums.length-1;
            
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                int tem=Math.abs(sum - target);
                if(tem<closest)
                {
                    closest=tem;
                    mSum=sum;
                }
                if(sum==target)
                {
                    return target;
                }else if(sum>target)
                {  
                    k--;
                }else
                {   
                    j++;
                }
             
            }
        }
        return mSum;
        
    }
}