public class Solution {

	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    ArrayList<Integer> ans = new ArrayList<>();
	    Collections.sort(a);
	    if(a.size()<2)
	    return a;
	    for(int i=0;i<a.size();i++)
	    {
	        if(i%2==0 && i+1<a.size())
	            ans.add(a.get(i+1));
	        else if(i%2!=0)
	            ans.add(a.get(i-1));
	        else if(i%2==0)
	            ans.add(a.get(i));
	    }
	    return ans;
	}
	
}
