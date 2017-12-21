public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        int[] a = new int[arrive.size()];
        int[] e = new int[arrive.size()];
        
        for(int i=0;i<a.length;i++){
            a[i] = arrive.get(i);
            e[i] = depart.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(e);
        
        int cnt = 1, max = 1;//, time = a[0];
        int i=1, j=0;
        
        while( i < a.length && j < a.length){
            
            if(a[i] < e[j]){
                cnt += 1;
                if(cnt > max){
                    max=cnt;
                    //time=a[i];
                }
                i++;
            }else{
                cnt -= 1;
                j+=1;
            }
        }
        if(max > K) return false;
        return true;
   
 
    }
}
