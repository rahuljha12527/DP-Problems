
public class Solution {

	
    public static int lcs1(String s1,String s2,int n,int m,int dp[][]){
        
        if(n==0 || m==0){
            return 0;
        }
        
        int myAns;
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            int ans;
            if(dp[n-1][m-1]==-1){
                ans=lcs1(s1,s2,n-1,m-1,dp);
                dp[n-1][m-1]=ans;
            }
            else{
                ans=dp[n-1][m-1];
            }
            
            myAns=1+ans;
            
        }
        else{
            
            int ans2,ans3;
            if(dp[n-1][m]==-1){
                ans2=lcs1(s1,s2,n-1,m,dp);
                dp[n-1][m]=ans2;
            }
            else{
                ans2=dp[n-1][m];
            }
            if(dp[n][m-1]==-1){
                ans3=lcs1(s1,s2,n,m-1,dp);
                dp[n][m-1]=ans3;
            }
            else{
               ans3 =dp[n][m-1];
            }
            myAns=Math.max(ans2,ans3);
        }
        
        return myAns;
    }
	public static int lcs(String s1, String s2){
		
	 
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        
        int ans=lcs1(s1,s2,s1.length(),s2.length(),dp);
        return ans;
	}

	
}
