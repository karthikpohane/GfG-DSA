//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

//User function Template for Java


class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        temp = binaryConverter(N);
        int maxLen = 0;
        int count = 0;
        for(int i=0; i<temp.size(); i++){
            if(temp.get(i)==1) count++;
            else count = 0;
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
    public static ArrayList<Integer> binaryConverter(int N){
        ArrayList<Integer> temp = new ArrayList<>();
        while(N!=0){
            temp.add(N%2);
            N = N/2;
        }
        Collections.reverse(temp);
        return temp;
    }
}




//{ Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		
System.out.println("~");
}
	}
}



// } Driver Code Ends