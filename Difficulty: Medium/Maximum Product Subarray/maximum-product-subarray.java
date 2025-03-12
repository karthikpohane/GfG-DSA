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
        int maxProd = nums[0];
        int suf = 1;
        int pre = 1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(suf == 0) suf =1;
            if(pre == 0) pre =1;
            pre = pre*nums[i];
            suf = suf *nums[n-i-1];
            maxProd = Math.max(maxProd, Math.max(suf, pre));
        }
        return maxProd;
    }
}