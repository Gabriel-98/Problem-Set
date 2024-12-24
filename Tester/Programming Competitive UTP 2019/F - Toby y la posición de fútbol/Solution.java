import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long sumaX = 0, sumaY = 0;
        double ansX, ansY;
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            sumaX += sc.nextLong();
            sumaY += sc.nextLong();
        }
        ansX = (double)sumaX;
        ansY = (double)sumaY;
        ansX /= n;
        ansY /= n;
        System.out.printf("%.3f %.3f\n", ansX, ansY);
    }
}
