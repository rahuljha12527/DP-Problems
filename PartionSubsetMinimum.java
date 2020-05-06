/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
     public static int subsetSumTotal(int n,int arr[],int sumCalculated,int sumTotal){
         
         if(n==0){
         	return Math.abs((sumTotal-sumCalculated)-sumCalculated);
         }

         return Math.min(subsetSumTotal(n-1,arr,sumCalculated+arr[n-1],sumTotal),
         		subsetSumTotal(n-1,arr,sumCalculated,sumTotal));


    }			
    public static int subsetSum(int n,int arr[]){
          
         int sumTotal=0;
         for(int i=0;i<arr.length;i++){
         	sumTotal=sumTotal+arr[i];
         }

         return subsetSumTotal(n,arr,0,sumTotal);

	}		
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		int ans=subsetSum(n,arr);
		System.out.println(ans);
	}
}
