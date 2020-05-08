
public class Solution {

	
	public static int lcs(String s1, String s2){
		
	
        int m=s1.length();
        int n=s2.length();
        
        int dp[][]=new int[m+1][n+1];
        
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        int result=0;
        
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    
                    dp[i][j]=1+dp[i-1][j-1];
                    result=Math.max(dp[i][j],result);
                }
                else{
                    
                    dp[i][j]=0;
                }
            }
        }
        
        return result;

	}

	
}
