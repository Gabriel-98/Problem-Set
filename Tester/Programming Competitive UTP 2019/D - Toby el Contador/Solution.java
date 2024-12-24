import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> alp = new Vector<Integer>();
          for(int i=0; i<256; i++){ alp.add(0); }
        String cad;
        while(sc.hasNext()){
            char ans = 'A';
            cad = sc.nextLine();
            for(int i='A'; i<='Z'; i++){
                alp.set(i, 0);
                alp.set(i+'a'-'A', 0);
            }
            for(int i=0; i<cad.length(); i++){
                int pos = cad.charAt(i);
                alp.set(pos, alp.get(pos) + 1);
            }
            for(int i='A'; i<='Z'; i++){
                if(alp.get(i) > alp.get(ans))
                ans = (char)i;
            }
            for(int i='a'; i<='z'; i++){
                if(alp.get(i) > alp.get(ans))
                ans = (char)i;
            }
            System.out.println(ans);
        }
    }
}
