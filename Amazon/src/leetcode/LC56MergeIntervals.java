package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LC56MergeIntervals {

	public static void main(String[] args) {
		//[1,3],[2,6],[8,10],[15,18], 
		Interval interval1 = new Interval(1,3);
		Interval interval2 = new Interval(2,6);
		Interval interval3 = new Interval(8,10);
		Interval interval4 = new Interval(15,18);
		List<Interval> input = new ArrayList();
		input.add(interval1);
		input.add(interval2);
		input.add(interval3);
		input.add(interval4);
		List<Interval> result =merge(input);
		for(Interval interval:result){
			System.out.println("["+interval.start+","+ interval.end+"]");
		}
	}

	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new ArrayList();
		if(intervals==null || intervals.size()==0)
			return result;
		Comparator<Interval> comp = new Comparator<Interval>()  {
			@Override
			public int compare(Interval i1, Interval i2) {
				if(i1.start==i2.start) 
					return i1.end-i2.end;  
				return i1.start-i2.start;
			}
		};
		Collections.sort(intervals,comp);
		result.add(intervals.get(0));
		for(int i=1;i<intervals.size();i++){
			Interval current =intervals.get(i);
			Interval last = result.get(result.size()-1);
			if(current.start>last.end)
				result.add(current);
			else{
				if(last.end<current.end)
					last.end=current.end;
			}
		}
		
		return result;
	}
	
	
}

 class Interval{
	public Interval(Integer start, Integer end) {
		super();
		this.start = start;
		this.end = end;
	}
	Integer start;
	Integer end;
}
