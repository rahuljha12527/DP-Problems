/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
     public static int UnboundKnapsack(int weight,int val[],int n,int wt[]){

     	int dp[][]=new int[n+1][weight+1];

     	for(int i=0;i<=n;i++){
     		for(int j=0;j<=weight;j++){
     			if(i==0 || j==0){
     				dp[i][j]=0;
     			}
     		}
     	}
        for(int i=1;i<n+1;i++){
     	   for(int j=1;j<weight+1;j++){

             if(wt[i-1]<=j){
             	dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
             }     	   	

             else{
             	dp[i][j]=dp[i-1][j];
             }
     	   }	
     	}

       return dp[n][weight];

     }
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	   int weight=sc.nextInt();
	   int val=sc.nextInt();
	   int arr[]=new int[val];

	   for(int i=0;i<val;i++){
	   	  arr[i]=sc.nextInt();
	   }	
       
       int wt[]=new int[val];
	   for(int i=0;i<val;i++){
           wt[i]=sc.nextInt();
	   }

	   int ans=UnboundKnapsack(weight,arr,val,wt);
	   System.out.println(ans);
	}
}
