package interviewbit.a01_arrays.b03_SimulationArray.c01_MaxNonNegativeSubArray;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        int cI = -1;
        int cJ = -1;
        int mI = -1;
        int mJ = -2;
        long curSum = 0;
        long maxSum = 0;
        boolean flag = true;
        for(int i=0; i<A.size(); i++) {
            int val = A.get(i);
            if(val >= 0) {
                if(flag) {
                    cI = i;
                    flag = false;
                }
                cJ = i;
                curSum += val;
                if(curSum > maxSum || (curSum == maxSum && (cJ - cI) > (mJ - mI))) {
                    maxSum = curSum;
                    mI = cI;
                    mJ = cJ;
                }
            } else {
                curSum = 0;
                flag = true;
            }
        }
        ArrayList<Integer> res = new ArrayList<>(2);
        if((mJ - mI) >= 0) {
            for(int i=mI; i<=mJ; i++) {
                res.add(A.get(i));
            }
        }
        return res;
    }
}
