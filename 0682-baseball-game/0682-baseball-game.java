class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> s = new Stack<>();
       for(String op:operations)
       {
        if(op.equals("C"))
        {
            s.pop();
        }
        else if(op.equals("D"))
        {
            s.push(s.peek()*2);
        }
        else if(op.equals("+"))
        {
            int first = s.pop();
            int second = s.peek();
            s.push(first);
            s.push(first+second);
        }
        else
        {
            s.push(Integer.parseInt(op));
        }
       }
       int sum =0;
       while(!s.empty())
       {
        sum+=s.pop();
       }
         return sum;
    }
}