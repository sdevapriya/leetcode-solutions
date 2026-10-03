class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int half = n/2;
        int count =0;
        int found =0;
        for(int i =0;i<arr.length;i++)
        {
                  if((arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')&&i<half)
                  {
                    count++;
                  }
                  else if((arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')&&i>=half)
                  {
                    found++;
                  }
        }
        if(count==found)
        {
            return true;
        }
        return false;
    }
}