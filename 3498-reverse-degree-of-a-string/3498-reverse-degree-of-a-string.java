class Solution {
    public int reverseDegree(String s) {
         char[] arr = s.toCharArray();
         int sum =0;
         for(int i=0;i<arr.length;i++)
         {
            int pro =1;
            int y = Math.abs((int)arr[i]-'a');
            int x = 26-y;
            pro = (int)(x*(i+1));
            sum = sum+pro;
         }
         return sum;
    }
}