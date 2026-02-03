import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
class Sum3
{
  public static List<List<Integer>> threeSum(int[] nums) {

    
    // System.out.println(nums[i]);



    // for(int i=0;i<nums.length-2;i++)
    // {
    //     for(int j=i+1;j<nums.length-1;j++)
    //     {
    //         for(int k=j+1;k<nums.length;k++)
    //         {  if(nums[i]+nums[j]+nums[k]==0)
    //              {
    //                   List<Integer>newList=Arrays.asList(nums[i],nums[j],nums[k]);
    //                   Collections.sort(newList);
    //                   if(!result.contains(newList))
    //                     {
    //                        result.add(newList);
    //                       }
    //              }
    //         }
    //     }
    // }

    List<List<Integer>> result=new ArrayList<>();
    Arrays.sort(nums);
    
    
     for(int i=0;i<nums.length-2;i++)
     {
        if(i>0 && nums[i]==nums[i-1]) continue;
        int j=i+1;
        int k=nums.length-1;
        
        while(j<k)
        {
             if(nums[i]+nums[j]+nums[k]==0)
            {
               List<Integer>newList=Arrays.asList(nums[i],nums[j],nums[k]);
               result.add(newList);
                while(j<k && nums[j]==nums[j+1])
                {
                    j++; 
                }
                while(j<k && nums[k]==nums[k-1])
                {
                    k--; 
                }

                j++;
                k--;
                
            }
            else if(nums[i]+nums[j]+nums[k]<0)
            {
                  j++;
            }
            else
            {
                k--;
            }
           

     }


     }

        return result;
    }

    public static void main(String args[])
    {
      int nums[]={3,0,-2,-1,1,2};
      System.out.println(threeSum(nums));
    }
}