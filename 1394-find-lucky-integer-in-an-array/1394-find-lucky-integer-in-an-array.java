class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer>set = new HashMap<>();
       int max =0;
       for(int num:arr)
       {
        set.put(num,set.getOrDefault(num,0)+1);
       }
       for(int nums:set.keySet())
       {
        if(nums==set.get(nums))
        {
            max = Math.max(max,nums);
        }
       }
       if(max==0)
       {
        return -1;
       }
       return max;
    }
}