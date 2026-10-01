class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        Stack<Character>stack = new Stack<>();
        stack.push(arr[0]);
        for(int i =1;i<arr.length;i++)
        {
            if(!stack.isEmpty()){
            if(stack.peek()!=arr[i])
            {
                stack.push(arr[i]);
            }
            else
            {
                stack.pop();
            }
            }
            else
            {
                stack.push(arr[i]);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch:stack)
        {
            res.append(ch);
        }
        return res.toString();
    }
}