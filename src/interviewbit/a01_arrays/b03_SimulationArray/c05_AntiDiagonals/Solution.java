package interviewbit.a01_arrays.b03_SimulationArray.c05_AntiDiagonals;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int j=0;
        for(int i=0; i<A.size(); i++) {
            int m=0;
            int n=i;
            res.add(new ArrayList<Integer>());
            while(A.size() > m && n >= 0) {
                res.get(i).add(A.get(m).get(n));
                m++;
                n--;
            }
        }
        for(int i=1; i<A.size(); i++) {
            int m=i;
            int n=A.size() - 1;
            while(A.size() > m && n >= 0) {
                res.get(i).add(A.get(m).get(n));
                m++;
                n--;
            }
        }
        return res;
    }
}
