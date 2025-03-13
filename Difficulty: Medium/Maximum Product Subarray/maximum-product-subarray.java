//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] nums) {
        int n = nums.length;
        int maxPro = nums[0];
        int sufix = 1;
        int prefix = 1;
        for(int i=0; i<n; i++){
            if(sufix==0) sufix=1;
            if(prefix==0) prefix=1;
            sufix *= nums[i];
            prefix *= nums[n-i-1];
            maxPro = Math.max(maxPro, Math.max(sufix, prefix));
        }
        return maxPro;
    }
}