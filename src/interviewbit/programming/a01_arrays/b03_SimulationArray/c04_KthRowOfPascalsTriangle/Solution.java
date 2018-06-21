package interviewbit.programming.a01_arrays.b03_SimulationArray.c04_KthRowOfPascalsTriangle;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> val = new ArrayList<>();
        if(A==0) return res;
        res.add(1);
        for(int i=1; i<=A; i++) {
            val.add(1);
            for(int j=1; j<i; j++) {
                val.add(res.get(j) - res.get(j-1));
            }
            val.add(1);
            res = val;
            val = new ArrayList<>();
        }
        return res;
    }
}
