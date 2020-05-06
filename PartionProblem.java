/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{   
      public static boolean subSetSum(int n,int arr[],int sum){

     	if(sum==0){
     		return true;
     	}
     	if(n==0 && sum!=0){
     		return false;

     	}

        if(arr[n-1]>sum){

          return subSetSum(n-1,arr,sum);
        }

        return subSetSum(n-1,arr,sum-arr[n-1])|| subSetSum(n-1,arr,sum);

     }
     public static boolean subSetSum(int n,int arr[]){

     	int sum=0;

     	for(int i=0;i<arr.length;i++){
     		sum=sum+arr[i];
     	}

         if(sum%2!=0){
         	return false;
         } 

         return subSetSum(n,arr,sum/2);

     }
	public static void main (String[] args) throws java.lang.Exception
	{
	   	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		if(subSetSum(n,arr)){
			 System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
