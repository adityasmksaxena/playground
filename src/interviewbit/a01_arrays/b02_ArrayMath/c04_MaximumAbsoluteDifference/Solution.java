package interviewbit.a01_arrays.b02_ArrayMath.c04_MaximumAbsoluteDifference;

import java.util.ArrayList;

public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        int min1 = Integer.MIN_VALUE;
        int min2 = Integer.MIN_VALUE;

        for(int i=0; i<A.size(); i++) {
            int val1 = A.get(i) + i + 1;
            int val2 = A.get(i) - i - 1;
            if(val1>max1) max1=val1;
            if(val1<min1) min1=val1;
            if(val2>max2) max2=val2;
            if(val2<min2) min2=val2;
        }
        int dif1 = max1 - min1;
        int dif2 = max2 - min2;

        return dif1 > dif2 ? dif1 : dif2;
    }
}

