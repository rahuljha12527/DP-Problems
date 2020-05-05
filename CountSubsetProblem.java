/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   public static int CountSubsetSum(int n,int arr[],int sum){

    	int ans[][]=new int[n+1][sum+1];

        for(int i=0;i<sum+1;i++){
        	ans[0][i]=0;
        }
    	for(int i=0;i<n+1;i++){
    		ans[i][0]=1;
         }

         for(int i=1;i<n+1;i++){
         	for(int j=1;j<sum+1;j++){
         		if(arr[i-1]<=j){
         		 ans[i][j]	= ans[i-1][j]+ans[i-1][j-arr[i-1]];
         		}else{
         			ans[i][j]=ans[i-1][j];
         		}
         	}
         }
        
        return ans[n][sum];

    }
	public static void main (String[] args) throws java.lang.Exception
	{
	  	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		int sum=sc.nextInt();

		int count=CountSubsetSum(n,arr,sum);
		System.out.println(count);
	}
}
