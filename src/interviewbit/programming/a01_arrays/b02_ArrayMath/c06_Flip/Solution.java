package interviewbit.programming.a01_arrays.b02_ArrayMath.c06_Flip;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> flip(String A) {
        int cI = -1;
        int cJ = -1;
        int mI = -1;
        int mJ = -2;
        int curCnt = 0;
        int maxCnt = 0;
        boolean flag = true;
        for(int i=0; i<A.length(); i++) {
            char ch = A.charAt(i);
            if(ch == '0') {
                if(flag) {
                    cI = i;
                    flag = false;
                }
                cJ = i;
                curCnt++;
                if(curCnt > maxCnt) {
                    maxCnt = curCnt;
                    mI = cI;
                    mJ = cJ;
                }
            } else if(ch == '1') {
                curCnt--;
                if(curCnt < 0) {
                    curCnt=0;
                    flag = true;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>(2);
        if(mJ - mI >= 0) {
            res.add(mI + 1);
            res.add(mJ + 1);
        }
        return res;
    }
}

