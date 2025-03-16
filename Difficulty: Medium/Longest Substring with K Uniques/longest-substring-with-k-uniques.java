//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int maxLen = -1;  // Initialize to -1 in case no valid substring exists
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> maps = new HashMap<>();

        while (right < s.length()) {
            maps.put(s.charAt(right), maps.getOrDefault(s.charAt(right), 0) + 1);

            while (maps.size() > k) {  // Shrink the window if unique character count exceeds k
                maps.put(s.charAt(left), maps.get(s.charAt(left)) - 1);
                if (maps.get(s.charAt(left)) == 0) {
                    maps.remove(s.charAt(left)); // Remove character if frequency becomes zero
                }
                left++;  // Move left pointer
            }

            if (maps.size() == k) {  // Only update max length if we have exactly k unique characters
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;  // Expand window
        }

        return maxLen;
    }
}
