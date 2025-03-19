//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            System.out.println(new Solution().minJumps(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr) {
        int n = arr.length;
        
        // If array has only one element, no jump is required
        if(n == 1) return 0;

        // If first element is 0, we can't move forward
        if(arr[0] == 0) return -1;

        int jumps = 1;    // Number of jumps needed to reach the end
        int maxReach = arr[0]; // Maximum index that can be reached
        int steps = arr[0];    // Steps available within the current jump

        for(int i = 1; i < n; i++) {
            // Check if we've reached the last element
            if(i == n - 1) return jumps;

            // Update maxReach to the furthest point reachable from this position
            maxReach = Math.max(maxReach, i + arr[i]);

            // Use a step
            steps--;

            // If no steps remain
            if(steps == 0) {
                jumps++;  // Increase the jump count
                
                // If current index exceeds or equals the maxReach, we can't move further
                if(i >= maxReach) return -1;

                // Reinitialize steps with the number of steps to reach maxReach
                steps = maxReach - i;
            }
        }
        return -1;
    }
}
