/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    
      public static int lcs(String s1,String s2,int m,int n){

     	int dp[][]=new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
        	for(int j=0;j<n+1;j++){
        		if(i==0 || j==0){
        			dp[i][j]=0;
        		}
        	}
        }

        for(int i=1;i<m+1;i++){
        	for(int j=1;j<n+1;j++){

        		if(s1.charAt(i-1)==s2.charAt(j-1)){
        			dp[i][j]=1+dp[i-1][j-1];
        		}else{

        			dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        		}
        	}
        }
        
        int minimumDeletion=s1.length()-dp[m][n];
        return minimumDeletion;

     }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);

		 String s1=sc.nextLine();
// 		 String s2=sc.nextLine();
            
         String s2="";
         for(int i=0;i<s1.length();i++){
             s2=s1.charAt(i)+s2;
         }
         
         
		 int m=s1.length();
		 int n=s2.length();

	    int ans= lcs(s1,s2,m,n);
		System.out.println(ans); 	 	
	}
}
