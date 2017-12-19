public class Solution {
    public int Comb(int n,int r){
        float ans=1;
        for(int i=r+1;i<=n;i++)
        {
            ans = (ans*i)/(float)(i-r);
        }
        return (int)ans;
        
    }
	public ArrayList<Integer> getRow(int a) {
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    for(int i=0;i<=a;i++)     //nC0 + nC1 .....  n!/(r!(n-r)!)
	    {
	        if(i==0 || i == a)
	        {
	            ans.add(1);
	        }
	        else
	        {
	            ans.add(Comb(a,i));
	        }
	    }return ans;
	}
	
}
