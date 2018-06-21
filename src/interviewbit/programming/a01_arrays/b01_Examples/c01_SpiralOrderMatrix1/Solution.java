package interviewbit.programming.a01_arrays.b01_Examples.c01_SpiralOrderMatrix1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {

        int totalElements = A.size() * A.get(0).size();
        ArrayList<Integer> res = new ArrayList<>(totalElements);

        int dir = 0;

        int left = 0;
        int top = 0;
        int right = A.get(0).size();
        int bottom = A.size();

        while( left < right && top < bottom ) {

            if (dir == 0) {
                for (int j = left; j < right; j++) {
                    res.add(A.get(top).get(j));
                }
                top++;
            } else if (dir == 1) {
                for (int j = top; j < bottom; j++) {
                    res.add(A.get(j).get(right-1));
                }
                right--;
            } else if (dir == 2) {
                for (int j = right-1; j >= left; j--) {
                    res.add(A.get(bottom-1).get(j));
                }
                bottom--;
            } else if (dir == 3) {
                for (int j = bottom-1; j >= top; j--) {
                    res.add(A.get(j).get(left));
                }
                left++;
            }

            dir++;
            dir = dir % 4;
        }

        return res;
    }
}
