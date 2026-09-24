class Solution {
    public int smallestIndex(int[] nums) {
        int temp =0;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            int rem =0;
            int sum=0;
            if(nums[i]<=9)
            {
                if(nums[i]==i)
                {
                    temp = i;
                    min =Math.min(min,temp);
                }
            }
            else if(nums[i]>9)
            {
                while(nums[i]>0)
                {
                    rem = nums[i]%10;
                    sum = sum+rem;
                    nums[i]=nums[i]/10;
                }
                if(sum==i)
                {
                    temp=i;
                     min =Math.min(min,temp);
                }
            }
            
        }
        if(min==Integer.MAX_VALUE)
        {
            return -1;
        }
        return min;
    }
}