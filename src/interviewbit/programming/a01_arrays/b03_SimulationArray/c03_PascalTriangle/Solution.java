package interviewbit.programming.a01_arrays.b03_SimulationArray.c03_PascalTriangle;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(A);
        if(A==0) return res;
        res.add(new ArrayList<Integer>(1));
        res.get(0).add(1);
        for(int i=1; i<A; i++) {
            res.add(new ArrayList<Integer>(i+1));
            res.get(i).add(1);
            for(int j=1; j<i; j++) {
                res.get(i).add(res.get(i-1).get(j) + res.get(i-1).get(j-1));
            }
            res.get(i).add(1);
        }
        return res;
    }
}
