
public class Solution {

	
    public static int editDistanceRecursion(String s1,String s2,int m,int n){
        
        if(m==0){
            return n;
        }
        
        if(n==0){
            return m;
        }
        
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            
            return editDistanceRecursion(s1,s2,m-1,n-1);
        }
        else{
            
            return 1+Math.min(editDistanceRecursion(s1,s2,m-1,n),Math.min(editDistanceRecursion(s1,s2,m-1,n-1),
                                                                          editDistanceRecursion(s1,s2,m,n-1)));
        }
        
    } 
	public static int editDistance(String s1, String s2){
		
        int m=s1.length();
        int n=s2.length();
	  
        
        return editDistanceRecursion(s1,s2,m,n);
	}

	
}
