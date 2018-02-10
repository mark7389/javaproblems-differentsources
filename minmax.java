import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class minmax {
    static void swap(int s_I, int e_I, int [] arr){
            int temp = arr[s_I];
            arr[s_I] = arr[e_I];
            arr[e_I] = temp;
    }
    static void sort(int [] arr){
        int len = arr.length;
        int smallest = 0;
        for(int i=0; i< len; i++){
            
            smallest = i;
            
            for(int j=i+1; j<len; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            if(i != smallest){
                swap(i,smallest, arr);
            }
            
        }
    }
    static void miniMaxSum(int[] arr) {
        // Complete this function
        sort(arr);
        long minSum = 0;
        for(int i = 0; i<arr.length-1; i++){
                minSum += arr[i];
        }
        long maxSum = 0;
        for(int i = 1; i<arr.length; i++){
                maxSum += arr[i];
        }
        System.out.println(minSum+" "+maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}