// { Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        int largest=0,second=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            largest=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<largest&&arr[i]>second)
            second=arr[i];
        }
        return second;
        // code here
    }
}