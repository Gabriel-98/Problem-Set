import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        Vector<Character> ans = new Vector<Character>();
        number = sc.next();
        for(int i=0; i<number.length(); i++){ ans.add(number.charAt(i)); }
        for(int i=0; i<ans.size(); i++){
            if(ans.get(i) == '9'){
                ans.set(i, '0');
                break;
            }
        }

        int i;
        for(i=0; i<(ans.size()-1); i++){
            if(ans.get(i) != '0')
            break;
        }
        for(; i<ans.size(); i++){ System.out.print(ans.get(i)); }
        System.out.println();
    }
}
