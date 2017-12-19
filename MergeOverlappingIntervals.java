/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

public class Solution {
    public class Sortbystart implements Comparator<Interval>
        {
            public int compare(Interval a, Interval b)
            {
                return a.start - b.start;
            }
        }
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> ans = new ArrayList<>();
        Collections.sort(intervals, new Sortbystart());
        int start=intervals.get(0).start,end = intervals.get(0).end,flag=0;
        for(int i = 0;i<intervals.size();i++)
        {
            if(end<intervals.get(i).start)
                ans.add(new Interval(start,end));
                
            if(intervals.get(i).start > end)
                start = intervals.get(i).start;
            if(end<intervals.get(i).end)
                end = intervals.get(i).end ;
                
            if(i == intervals.size()-1 )
            {
                end = end>intervals.get(i).end?end:intervals.get(i).end;
                ans.add(new Interval(start,end));
            }
        }
    return ans;
    }
}
