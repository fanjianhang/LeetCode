package nowcoder;

import java.util.ArrayList;
import java.util.Comparator;

public class NC37 {

}

class NC37Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // 先对输入的数组排序
        intervals.sort(new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        ArrayList<Interval> result = new ArrayList<Interval>();
        // 筛选前数组end>=后数组start的interval
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.start > end) {
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
                continue;
            }
            if (interval.start <= start && start <= interval.end) start = interval.start;
            if (interval.start <= end && end <= interval.end) end = interval.end;
        }
        result.add(new Interval(start, end));
        return result;

    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
