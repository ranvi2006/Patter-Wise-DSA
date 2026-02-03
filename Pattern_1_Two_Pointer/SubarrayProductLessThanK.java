class Solution {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        

         int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int product=nums[i];
            if(product<k)
            {
                count++;
                 if(i<nums.length-1)
            {
               product*=(nums[i+1]);
                if(product<k)
                {
                count++;
                 }


               if(i<nums.length-2)
            {
                product*=(nums[i+2]);
                 if(product<k)
                {
                count++;
                 }
            }
            }
            }
           
           
           
            
        }
        return count;
    }

    public static void main(String args[])
    {
        int nums[]={10,2,2,5,4,4,4,3,7,7};
        System.out.println(numSubarrayProductLessThanK(nums,289));
       
    }
}