import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    static void staircase(int n) {
        // Complete this function
        
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ; j < n ; j++){
                if(n-j-1 <= i){
                    System.out.print("#");
                    
                }
                else{
                   System.out.print(" ");
                }
                if(j==n-1){
                   System.out.print("\n");
                }
                
                
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}