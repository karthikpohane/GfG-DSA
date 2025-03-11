//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        int[] arr = new int[255];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }
        
        int maxLen = 0;
        int left = 0;
        int right = 0;
        while(right < s.length()){
            
            if(arr[s.charAt(right)] != -1){
                if(arr[s.charAt(right)] >= left){
                    left = arr[s.charAt(right)] +1;
                }
            }
            
            int len = right - left + 1;
            maxLen = Math.max(len, maxLen);
            arr[s.charAt(right)] = right;
            right++;
        }
        return maxLen;
    }
}