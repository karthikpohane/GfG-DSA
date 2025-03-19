//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean flag = ob.armstrongNumber(n);
            if (flag) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int dup = n;
        int len = 0;
        while(dup>0){
            dup = dup/10;
            len++;
        }
        
        dup = n;
        int arm = 0;
        while(dup>0){
            int temp = dup %10;
            arm += Math.pow(temp, len);
            dup = dup/10;
        }
        if(arm == n) return true;
        return false;
    }
}