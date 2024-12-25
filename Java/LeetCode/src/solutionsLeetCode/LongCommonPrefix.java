package solutionsLeetCode;

//import java.lang.reflect.Array;
import java.util.*;

public class LongCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String[] str= new String[n];		
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		Solution sol=new Solution();
		System.out.println(sol.longestCommonPrefix(str));
		

	}

}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        // for(String i : strs){
        //     for(int j=0;j<i.length();j++){
                
        //     }
        // }
        Arrays.sort(strs);
        for(int i=0;i<strs.length;i++) {
        	System.out.println(strs[i]);
        }
        
        String start=strs[0];
        String end=strs[strs.length-1];
        String st="";
        String en="";

        for(int i=0;i<start.length();i++){
            st+=start.charAt(i);
        }

//        System.out.print("\n"+st+"\n");
         for(int i=0;i<end.length();i++){
             en+=end.charAt(i);
        }

//        System.out.print(en);
        System.out.println(st+" "+en);
        for(int i=0;i<start.length();i++){
            if(start.charAt(i)!=end.charAt(i)){
                break;
            }
            s=s+start.charAt(i);
        }
        return s;
    }
}
