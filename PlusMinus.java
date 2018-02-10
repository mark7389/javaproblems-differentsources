import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        // Complete this function
        float pos = 0;
        float neg = 0;
        float zero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                pos++;
            }
            else if(arr[i] < 0){
                neg++;
            }
            else{
                zero++;
            }
        }
        
        
        System.out.println(pos/arr.length);
        System.out.println(neg/arr.length);
        System.out.println(zero/arr.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}