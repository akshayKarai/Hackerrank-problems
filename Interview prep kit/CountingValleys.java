import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int level= 0;
        int valley=0;
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i] == 'U'){
                level++;  
            }if(c[i] == 'D'){
                level--;          
            }
            if(level == 0 && c[i] == 'U'){
                valley++;
            }
        }

        System.out.println(valley);
        return valley; 
    }
    //     int v = 0;     // # of valleys
    //     int lvl = 0;   // current level
    //     for(char c : s.toCharArray()){
    //         if(c == 'U') lvl++;
    //         if(c == 'D') lvl--;
            
    //         // if we just came UP to sea level
    //         if(lvl == 0 && c == 'U')
    //             v++;
    //     }
    //     System.out.print(v);
    //     return v;
    // }

        // System.out.println(valley);
        // return valley;


    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
