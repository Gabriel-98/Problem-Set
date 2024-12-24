import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,ans=0,x,y,i;
        n = sc.nextInt(); m = sc.nextInt();
        Vector<Integer> contador = new Vector<Integer>();
        for(i=0; i<n; i++){ contador.add(0); }
        for(i=0; i<m; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            contador.set(x, contador.get(x) + 1);
            contador.set(y, contador.get(y) + 1);
            if(contador.get(x) > ans)
            ans = contador.get(x);
            if(contador.get(y) > ans)
            ans = contador.get(y);
        }
        System.out.println(ans);
    }
}
