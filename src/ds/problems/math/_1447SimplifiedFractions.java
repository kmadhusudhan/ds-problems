package ds.problems.math;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/simplified-fractions
//1447. Simplified Fractions
public class _1447SimplifiedFractions {

    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        for(int i = 1;i<n;i++) {
            for(int j=i+1;j<=n;j++) {
                if(gcd(i,j) == 1) {
                    ans.add(i + "/" + j);
                }
            }
        }
        return ans;
    }

    int gcd(int a,int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b,a%b);
    }
}
