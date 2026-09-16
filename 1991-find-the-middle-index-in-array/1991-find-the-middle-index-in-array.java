class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0]=nums[0];
        for(int i =1;i<nums.length;i++)
        {
            pre[i]=pre[i-1]+nums[i];
        }
        suf[suf.length-1]=nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--)
        {
            suf[i]=suf[i+1]+nums[i];
        }
        for(int i =0;i<pre.length;i++)
       {
        if(pre[i]==suf[i])
        {
            return i;
        }
       }
       return -1;
    }
}