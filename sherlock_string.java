import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        s= s.toLowerCase();
        int[] a=new int[26];
        int max=0,unique=0;
        int total=s.length();
        for(int i=0;i<s.length();i++)
        {
            int k=s.charAt(i);
            a[k-97]++;
            if(a[k-97]==1) //find unique char
                unique++;
            if(a[k-97]>max) //find max count
                max=a[k-97];
        }
        int ideal1=max*unique;
        int ideal2=(max-1)*unique;
        if(total==ideal1 || (ideal1-total)==1) //all equal|one less count of unique char 
            return "YES";
        else if ((total-ideal2)==1 ) //one extra count of unique char
            return "YES";
        else
            return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}