public class Solution {
    public ArrayList<Integer> flip(String A) {
        int val[] = new int[A.length()];
        for (int i=0;i<A.length();i++)
        {
            val[i] = Character.getNumericValue(A.charAt(i));
        }
        int  sum=0,temp=0, b=0,a=1;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<val.length;i++)
        {
            if(val[i]==1)
                {temp = temp -1;}
            else if(val[i]==0)
                {temp = temp+1;}
            if(temp<0) temp=0;
            if(temp>0 && temp>sum)
                {sum=temp;}
            
        }
        if(sum<=0) return ans;
        temp =0;
        for(int i=0;i<val.length;i++)
        {
            if(val[i]==1)
                {temp = temp -1;}
            else if(val[i]==0)
                {temp = temp+1;}
            
            if(temp<0)
                {a = i+1+1;temp=0;}
            if(temp==sum)
                {b=i+1;break;}
            
        }
        ans.add(a);ans.add(b);
        return ans;
    }
}
