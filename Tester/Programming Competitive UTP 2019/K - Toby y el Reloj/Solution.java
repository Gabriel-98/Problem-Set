import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String hora;
        hora = sc.next();
        n = (hora.charAt(0)-'0')*1000 + (hora.charAt(1)-'0')*100 + (hora.charAt(3)-'0')*10 + (hora.charAt(4)-'0');
        for(int i=1; i<=n; i++){
            if(n % i == 0)
            System.out.println(i);
        }
    }
}
