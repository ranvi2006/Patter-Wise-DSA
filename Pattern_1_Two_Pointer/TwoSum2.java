import java.util.Arrays;
class TwoSum2
{
   public static int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
        int sum = numbers[left] + numbers[right];
        if(sum==target)
        {
            return new int[]{left,right};
        }
        else if(sum>target)
        {
            right--;
        }
        else
        {
            left++;
        }
    }
    return new int[]{-1, -1};
}
    public static void main(String args[])
    {
      int numbers[]={2,7,11,15};
      int target=9;
      int arr[]=twoSum(numbers,target);
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
    }
}