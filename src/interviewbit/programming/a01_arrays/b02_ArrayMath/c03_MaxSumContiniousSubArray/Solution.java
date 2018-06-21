package interviewbit.programming.a01_arrays.b02_ArrayMath.c03_MaxSumContiniousSubArray;

import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int c_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0; i<A.size(); i++) {
            int val = A.get(i);
            c_sum += val;
            if(max_sum < c_sum)
                max_sum = c_sum;
            if(c_sum < 0) c_sum = 0;
        }
        return max_sum;
    }
}
