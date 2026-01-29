class Main
{

    public static int  deleteDuplicates(int[] numbers)
    {
        int left=0;
        int right=1;
        while(right<numbers.length)
        {
           if(numbers[left]!=numbers[right])
            {
                numbers[left+1]=numbers[right];
                left++;
                numbers[right]=0;
            }else
            {
                 numbers[right]=0;
            }
                right++;
            
        }
         return left+1;
    }
    public static void main(String args[])
    {
        int numbers[]={0,0,1,1,2,2,2,3,3,3,4,4,4,10};
        int count=deleteDuplicates(numbers);
        System.out.println(count);
    }
}