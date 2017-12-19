public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	    for(int i =0;i<a;i++)
	    {
	        ans.add(new ArrayList<Integer>());
	        for(int j = 0;j<=i;j++)
	        {
	            if(j==0)
	            ans.get(i).add(1);
	            else if(j==i && i!=0)
	            {
	                ans.get(i).add(1) ;
	            }
	            else
	            {
	               ans.get(i).add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j)) ;
	            }
	        }
	    }
	    return ans;
	}
}
