/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   

   public static boolean isPartition(int arr[],int n){

       int sum=0;
       for(int i=0;i<n;i++){
       	sum=sum+arr[i];
       }

       if(sum%2!=0){
       	return false;
       }
         
       boolean ans[][]=new boolean[n+1][sum/2+1];
       
       for(int i=0;i<sum/2+1;i++){
       	   ans[0][i]=false;
       }

        for(int i=0;i<n+1;i++){
        	ans[i][0]=true;
        }

        for(int i=1;i<n+1;i++){
        	for(int j=1;j<sum/2+1;j++){

        		if(arr[i-1]<=j){
                   
                   ans[i][j]=ans[i-1][j-arr[i-1]]|| ans[i-1][j];
        		}
        		else{
        			ans[i][j]=ans[i-1][j];
        		}
        	}
        }

      return ans[n][sum/2];

	}      
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		
		if(isPartition(arr,n)){
            
            System.out.println("true");


		}else{
			System.out.println("false");
		}

         

	}
}
