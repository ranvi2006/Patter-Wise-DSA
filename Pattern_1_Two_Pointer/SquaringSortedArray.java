class Main
{
      public static int[] sortedSquares(int[] nums) {
        if (nums.length == 0) {
             throw new IllegalArgumentException("Array is empty");
          }
        if(nums.length==1)
        {
            nums[0]=nums[0]*nums[0];
            return nums;
            // return;
        }

        int left=-1;
        int right=nums.length;
        int newArr[]=new int[nums.length];
        if(nums[0]>=0)
        {
            right=0;
        }else if(nums[nums.length-1]<0)
        {
            left=nums.length-1;
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>=0)
                {
                    right=i;
                    left=i-1;
                    break;
                }
            }
        }

        //  Squaring and put in the new Array
        int idx=0;
        while(left>=0 && right<nums.length)
        {
           if(Math.abs(nums[left])==nums[right])
           {
            newArr[idx]=nums[left]*nums[left];
            idx++;
            newArr[idx]=nums[left]*nums[left];
            idx++;
            left--;
            right++;
           }
           else if(Math.abs(nums[left])<nums[right])
           {
             newArr[idx]=nums[left]*nums[left];
             idx++;
             left--;
           }
           else
           {
            newArr[idx]=nums[right]*nums[right];
            idx++;
            right++;
           }
        }
        while(left>=0)
        {
            
           newArr[idx]=nums[left]*nums[left];
             idx++;
            
            left--;

        }
        while(right<nums.length)
        {
              newArr[idx]=nums[right]*nums[right];
            idx++;
            right++;
        }

        return newArr;
        
    }
    public static void main(String args[])
    {
      int nums[]={-7,-3,2,3,11};
      int newArr[]=sortedSquares(nums);
      for(int i=0;i<newArr.length;i++)
      {
        System.out.print(newArr[i]+" ");
      }
    

    }

}