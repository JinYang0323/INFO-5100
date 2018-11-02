import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment7_4_merge {
	
	public static void main(String[] arg0) {
		List<Interval> intervals = new ArrayList<>();
		Interval int1 = new Interval(1, 3);
		Interval int2 = new Interval(2, 6);
		Interval int3 = new Interval(8, 10);
		Interval int4 = new Interval(15, 18);
		intervals.add(int1);
		intervals.add(int2);
		intervals.add(int3);
		intervals.add(int4);
		List<Interval> result = merge(intervals);
		for(Interval interval : intervals)
			System.out.print(interval.start + "," + interval.end + " ");
		System.out.println("\nResult: ");
		// Simple Unit Test
		for(Interval interval : result)
			System.out.print(interval.start + "," + interval.end + " ");//should be 1,6 8,10 15,18 
	}
	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> list = new ArrayList<>();
		if(intervals == null) return list;
		int[] start = new int[intervals.size()];
		int[] end = new int[intervals.size()];
		for(int i = 0; i < intervals.size(); i++) {
			start[i] = intervals.get(i).start;
			end[i] = intervals.get(i).end;
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int i = 0;
		while(i < intervals.size()) {
			int st = start[i];
			while(i < intervals.size() - 1 && start[i + 1] <= end[i]) i++;
			list.add(new Interval(st, end[i]));
			i++;
		}
		return list;
    }
}

class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}