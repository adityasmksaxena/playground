package interviewbit.programming.a01_arrays.b02_ArrayMath.c05_RepeatAndMissingNumberArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>(2);
        int n = A.size();
        long AS = ((long)n * (n+1)) / 2;
        long ASS = ((long)n * (n+1) * ((2 * n) + 1)) / 6;
        long GS = 0;
        long GSS = 0;
        for(int i=0; i<A.size(); i++) {
            int t = A.get(i);
            GS += t;
            GSS += ((long)t * t);
        }
        long diff1 = GS - AS;
        long diff2 = (GSS - ASS)/diff1;
        int a = (int)(diff2 + diff1) / 2;
        int b = (int)(diff2 - a);
        res.add(a);
        res.add(b);
        return res;
    }
}
