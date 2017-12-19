public class Solution {
	public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
	    int  n = 1,row_i=0,col_i=0,row_n=a,col_n=a;
	    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	    
	    for(int j = 0;j<a;j++)
	    {
	        ans.add(new ArrayList<Integer>(Collections.nCopies(a, 0)));
	    }
	    while(n<=a*a)
	    {
	        for(int j=col_i;j<col_n;j++)
	        {
	            ans.get(row_i).set(j,n);
	            n++;
	        }
	        row_i++;
	        for(int i=row_i;i<row_n;i++)
	        {
	            ans.get(i).set(col_n-1,n);
	            n++;
	        }
	        col_n--;
	        for(int j = col_n-1;j>=col_i;j--)
	        {
	            ans.get(row_n-1).set(j,n);
	            n++;
	        }
	        row_n--;
	        for(int i = row_n-1;i>=row_i;i--)
	        {
	            ans.get(i).set(col_i,n);
	            n++;
	        }
	        col_i++;
	        
	    }
	    return ans;
	}
}
