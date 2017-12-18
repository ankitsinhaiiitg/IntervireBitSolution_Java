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
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
    ArrayList<Interval> ans = new ArrayList<>();
    int newstart = newInterval.start ,newend =newInterval.end,j; 
    if(intervals.size()==0)
    {
        ans.add(newInterval);
    }
    for(int i=0; i<intervals.size();i++)
    {
        
        
        if(intervals.get(i).start > newInterval.end)
        {   if(i ==0)
            {
               ans.add(newInterval); 
            }
            ans.add(intervals.get(i));}
        if(intervals.get(i).end < newInterval.start )
            ans.add(intervals.get(i));
        if(newInterval.start >=intervals.get(i).start  && newInterval.start <= intervals.get(i).end)
            {
                newstart=intervals.get(i).start;
            }
        if(newInterval.end <= intervals.get(i).end && newInterval.end >= intervals.get(i).start)
        {
            newend = intervals.get(i).end;
            Interval new1 = new Interval(newstart,newend);
            ans.add(new1);
        }
        else if(newInterval.end >= intervals.get(i).end && i==intervals.size()-1)
        {
            Interval new1 = new Interval(newstart,newend);
            ans.add(new1);
        }
        else if(newInterval.end >= intervals.get(i).end && newInterval.end < intervals.get(i+1).start)
        {
            Interval new1 = new Interval(newstart,newend);
            ans.add(new1);
        }
    }
        return ans;}
    }
