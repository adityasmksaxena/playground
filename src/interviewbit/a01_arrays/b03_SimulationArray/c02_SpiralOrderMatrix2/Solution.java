package interviewbit.a01_arrays.b03_SimulationArray.c02_SpiralOrderMatrix2;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(A);
        for(int i=0; i<A; i++) {
            res.add(new ArrayList<Integer>(A));
            for(int j=0; j<A; j++) {
                res.get(i).add(0);
            }
        }
        int dir = 0;
        int left = 0;
        int top = 0;
        int right = A;
        int bottom = A;
        int cnt = 0;
        while( left < right && top < bottom ) {
            if (dir == 0) {
                for (int j = left; j < right; j++) {
                    res.get(top).set(j, ++cnt);
                }
                top++;
            } else if (dir == 1) {
                for (int j = top; j < bottom; j++) {
                    res.get(j).set(right-1, ++cnt);
                }
                right--;
            } else if (dir == 2) {
                for (int j = right-1; j >= left; j--) {
                    res.get(bottom-1).set(j, ++cnt);
                }
                bottom--;
            } else if (dir == 3) {
                for (int j = bottom-1; j >= top; j--) {
                    res.get(j).set(left, ++cnt);
                }
                left++;
            }
            dir++;
            dir = dir % 4;
        }
        return res;
    }
}
