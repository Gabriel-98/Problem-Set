import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Tuberia{
    private int x, y;
    public Tuberia(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){ return x; }
    public int getY(){ return y; }
}


public class Solution {

    private static Vector<Tuberia> tuberias;

    public static String solver(int cont, int errores, int id, int[] v){
        //System.out.println(cont + " " + errores + " " + id);
        //for(int i=0; i<tuberias.size(); i++){ System.out.print(v[i] + " "); }    System.out.println();
        if(cont == tuberias.size())
        return "si";
        for(int i=0; i<tuberias.size(); i++){
            if(v[i] == 0){
                v[i] = 1;
                if(tuberias.get(id).getY() != tuberias.get(i).getX())
                errores++;
                if(errores <= 1 && solver(cont+1, errores, i, v).equals("si"))
                return "si";
                
                v[i] = 0;
                if(tuberias.get(id).getY() != tuberias.get(i).getX())
                errores--;
            }
        }
        return "no";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x,y,i;
        String ans;
        while(sc.hasNext()){
            n = sc.nextInt();
            tuberias = new Vector<Tuberia>();
            for(i=0; i<n; i++){
                x = sc.nextInt();
                y = sc.nextInt();
                tuberias.add(new Tuberia(x,y));
            }
            ans = "no";
            int[] v = new int[n];
            for(i=0; i<n; i++){
                v[i] = 1;
                ans = solver(1,0,i,v);
                v[i] = 0;
                if(ans == "si")
                break;
            }
            System.out.println(ans);
        }
    }
}
