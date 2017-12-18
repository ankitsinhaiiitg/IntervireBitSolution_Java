public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    long sum=0,temp=0;
	    for(int i=0;i<a.size();i++)
	    {
	        if(a.get(i)<0)
	        {temp=0;}
	        if(a.get(i)>=0)
	        {
	            temp=temp+a.get(i);
	        }
	        if(temp>sum)
	        {
	            sum=temp;
	        }
	    }
	    
	    temp = 0;
	    int a1=0,b=0,j=0,maxDiff=0;
	    ArrayList<List<Integer>> ans = new ArrayList<>();
	    for(int i=0;i<a.size();i++)
	    {
	        if(a.get(i)<0)
	        {temp=0;a1=i+1;}
	        if(a.get(i)>=0)
	        {
	            temp=temp+a.get(i);
	        }
	        if(temp==sum)
	        {
	            b=i;
	            if(maxDiff<(b-a1))
	                maxDiff = b-a1;
	            ans.add(Arrays.asList(a1,b,b-a1));
	        }
	    }
	    for(int i =0;i<ans.size();i++)
	    {
	        if(ans.get(i).get(2)==maxDiff)
	        {
	            a1=ans.get(i).get(0);
	            b=ans.get(i).get(1);
	            break;
	        }
	    }
	    ArrayList<Integer> ans1 = new ArrayList<Integer>();
	    for(int i=a1;i<=b;i++)
	    ans1.add(a.get(i));
	    
	    return ans1;

	    
	}
}
