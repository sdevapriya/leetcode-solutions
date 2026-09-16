class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
       
        for(int i=0;i<nums1.length;i++)
        {
            for(int j =0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    nums2[j]=Integer.MAX_VALUE;
                    res.add(nums1[i]);
                    break;
                }
            }
        }
        int[] res1 = new int[res.size()];
        int i=0;
        for(int nums:res)
        {
            res1[i]=nums;
            i++;
        }
        return res1;
        
    }
}