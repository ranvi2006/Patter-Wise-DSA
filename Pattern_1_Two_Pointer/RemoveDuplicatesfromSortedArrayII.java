class Solution {
        
      public  static int removeDuplicates(int[] nums) {
        Integer privData=null;
        int currIndex=0;
        int privCount=0;
        
        for(int i=0;i<nums.length;i++)
        {
             if(privData==null)

             {
                privData=nums[i];
                currIndex++;
                privCount=1;
             }else if(privData!=nums[i])
             {
                privData=nums[i];
                nums[currIndex]=nums[i];
                currIndex++;
                privCount=1;
             }else if(privData==nums[i] && privCount==1)
             {
                 privData=nums[i];
                nums[currIndex]=nums[i];
                currIndex++;
                privCount++;
             }
        }
        return currIndex;
    }

    public static void main(String args[])
    {
        int nums[]={-5,-3,-3,-3,0,1,1,1,1,2,2,2,2,3,3,3,3};
        int k=removeDuplicates(nums);
        for(int i=0;i<k;i++)
        {
          System.out.print(nums[i]+" ");
        }
        
    }
}