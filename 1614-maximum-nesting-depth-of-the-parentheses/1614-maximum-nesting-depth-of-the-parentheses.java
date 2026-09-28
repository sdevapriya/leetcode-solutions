class Solution {
    public int maxDepth(String s) {
        char[] arr = s.toCharArray();
        int count =0;
        int max =0;
        for(int i =0;i<arr.length;i++)
        {
            
            if(arr[i]=='(')
            {
                count++;
                max = Math.max(max,count);
            }
            else if(arr[i]==')')
            {
                count = count-1;
            }
        }
        return max;
    }
}