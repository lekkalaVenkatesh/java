package com.java.puzzles.k;

public class CFGTemp {

	public static void main() {

		int A[] = {1,2,8,2,1};
		int B[] = {8,2,1,4,7};
		int aLength = A.length;
		
		int bLength = B.length;
		
		int[][] dp = new int[aLength+1] [bLength+1];
		
		for(int i=0;i <=aLength ;i++) {
			
			for(int j=0;j <=bLength ;j++) {
				
				dp[i][j]= 0;
			}
			
		}
		
		
		for (int i = aLength - 1; i >= 0; i--) {

			for (int j = aLength - 1; j >= 0; j--) {

				if (A[i] == B[j]) {

					dp[i][j] = dp[i + 1][j + 1] + 1;

				}

			}

		}
		
		int max= 0;
		

       for(int i=0;i <aLength ;i++) {
			
			for(int j=0;j <bLength ;j++) {
				
				max= Math.max(max,dp[i][j]);
			}
			
		}
		
		
       System.out.println(max);
       
	}

}
