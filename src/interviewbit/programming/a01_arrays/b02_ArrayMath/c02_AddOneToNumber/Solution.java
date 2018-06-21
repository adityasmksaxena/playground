package interviewbit.programming.a01_arrays.b02_ArrayMath.c02_AddOneToNumber;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        while(i<A.size() && A.get(i)==0) i++;
        if(i==A.size()) {
            res.add(1);
            return res;
        }
        for(int j=A.size()-1; j>=i; j--) {
            res.add(A.get(j));
        }
        boolean flag = true;
        ArrayList<Integer> ans = new ArrayList<>(res.size());
        for(i=0; i<res.size(); i++) {
            if(flag) {
                if(res.get(i) == 9) {
                    ans.add(0);
                    if(i==res.size()-1) ans.add(1);
                } else {
                    ans.add(res.get(i)+1);
                    flag = false;
                }
            } else ans.add(res.get(i));
        }
        Collections.reverse(ans);
        return ans;
    }
}
