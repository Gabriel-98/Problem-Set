import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,q,a,b;
        Vector<Integer> numero, ans;      
        while(sc.hasNext()){
            n = sc.nextInt();   q = sc.nextInt();
            numero = new Vector<Integer>();
            ans = new Vector<Integer>();
            while(n > 0){
                numero.add(n % 10);
                n /= 10;
            }

            for(int i=numero.size()-1; i>=0; i--){ ans.add(numero.get(i)); }
            for(; q>0; q--){
                a = sc.nextInt(); b = sc.nextInt();
                for(int i=1; i<a; i++){ ans.add(0); }
                ans.add(b);
            }
            for(int i=0; i<ans.size(); i++){ System.out.print(ans.get(i)); }
            System.out.println();
        }
    }
}
