package interviewbit.programming.a01_arrays.b02_ArrayMath.c01_MinStepInInfiniteGrid;

import java.util.ArrayList;

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int res = 0;
        int a = A.get(0);
        int b = B.get(0);
        for (int i = 1; i < A.size(); i++) {
            res += Math.max(Math.abs(a - A.get(i)), Math.abs(b - B.get(i)));
            a = A.get(i);
            b = B.get(i);
        }
        return res;
    }
}
