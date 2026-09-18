class Solution {
    public void sortColors(int[] nums) {
        int j =0;
        int temp =0;
        int n = nums.length;
        for(int i =0;i<nums.length;i++)
        {
              if(nums[i]==0)
              {
                temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
              }
        }
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==2)
            {
                 temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}