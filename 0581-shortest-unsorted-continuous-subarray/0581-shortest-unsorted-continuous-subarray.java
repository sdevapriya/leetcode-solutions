class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = nums.clone();
        int temp1 =0;
        int temp2 =0;
        Arrays.sort(arr);
        for(int i =0;i<nums.length;i++)
        {
            if(arr[i]!=nums[i])
            {
                temp1 =i;
                break;
            }
        } 
        for(int i =nums.length-1;i>=0;i--)
        {
            if(arr[i]!=nums[i])
            {
                temp2 =i;
                break;
            }
        } 
        if(temp1==0&&temp2==0)
        {
            return 0;
        }
        return (temp2-temp1)+1;
    }
}