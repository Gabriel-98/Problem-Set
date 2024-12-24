import java.io.*;
import java.util.*;

class ComparatorAscendente implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b){ return a - b; }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,q,x;
        Vector<Integer> galletas = new Vector<Integer>();
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            galletas.add(sc.nextInt());
        }
        galletas.sort(new ComparatorAscendente());
        q = sc.nextInt();
        for(; q>0; q--){
            x = sc.nextInt();
            if(x < galletas.get(0))
            System.out.println(0);
            else{
                int inf = 0, sup = n-1, mitad;
                while(inf < sup){
                    mitad = (inf + sup + 1) / 2;
                    if(galletas.get(mitad) <= x)
                    inf = mitad;
                    else
                    sup = mitad - 1;
                }
                System.out.println(inf + 1);
            }
        }
    }
}
