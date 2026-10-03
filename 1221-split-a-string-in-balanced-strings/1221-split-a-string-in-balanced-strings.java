class Solution {
    public int balancedStringSplit(String s) {
       char[] arr = s.toCharArray();
       int r =0;
       int l =0;
       int found =0;
        for(int i =0;i<arr.length;i++)
        {
             if(arr[i]=='R')
             {
                r++;
             }
             if(arr[i]=='L')
             {
                l++;
             }
             if(r==l)
             {
                r =0;
                l= 0;
                found++;
             }
        }
        return found;
    }
}