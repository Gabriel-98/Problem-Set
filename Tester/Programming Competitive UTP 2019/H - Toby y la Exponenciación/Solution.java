import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        long b,n,mod,k,ans;
        mod = 1000000007;
        b = sc.nextLong();
        n = sc.nextLong();
        Vector<Integer> bin = new Vector<Integer>();
        while(n > 0){
            bin.add((int)(n % 2));
            n /= 2;
        }
        ans = 1;
        for(i=0,k=b; i<bin.size(); i++,k=(k*k)%mod){
            if(bin.get(i) == 1)
            ans = (ans * k) % mod;
        }
        System.out.println(ans);
    }
}
