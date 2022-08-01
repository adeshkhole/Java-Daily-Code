import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        for (int i=a[n-1]; i<=b[0]; i++){
            boolean flag=true;
            for (int j=0; j<n; j++){
                if (i%a[j]!=0){
                    flag=false;
                    break;
                }           
            }
            if (flag==true){
                for (int j=0; j<m; j++){
                    if (b[j]%i!=0){
                        flag=false;
                        break;
                    }
                }
            }
            if (flag==true)
                count++;
        }
        System.out.println (count);
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = 0;
        
        for(int i = 0; i < n-m+1; i++){
            int tmpSum = 0;
            for(int j = i; j < i+m; j++){
                tmpSum+= squares[j];
            } 
            if(tmpSum == d){
                result++;
            }
        }
        System.out.println(result);
        
    }
}