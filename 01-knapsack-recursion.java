/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static int knapSack(int wt[],int val[],int maxWeight,int n){

          if(n==0 || maxWeight==0){
          	return 0;
          }

          if(wt[n-1]<=maxWeight){

          	return  Math.max(val[n-1]+knapSack(wt,val,maxWeight-wt[n-1],n-1),knapSack(wt,val,maxWeight,n-1));
          }

          else{

          	return knapSack(wt,val,maxWeight,n-1);
          }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int wt[]=new int[n];

		for(int i=0;i<n;i++){
			wt[i]=sc.nextInt();
		}

		int val[]=new int[n];
		for(int i=0;i<n;i++){
			val[i]=sc.nextInt();
		}

        int maxWeight=sc.nextInt();
		System.out.println(knapSack(wt,val,maxWeight,n));
	}
}
