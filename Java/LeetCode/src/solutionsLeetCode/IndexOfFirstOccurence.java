package solutionsLeetCode;
import java.util.*;

public class IndexOfFirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		System.out.println(strstr(str1,str2));
	}
	public static int strstr(String str1,String str2) {
		int n1=str1.length();
		int n2=str2.length();
		for(int i=0;i<n1-n2+1;i++) {
			if(str1.charAt(i)==str2.charAt(0)) {
				if(str1.substring(i,n2+i).equals(str2)) {
					return i;
				}
			}
		}
		return -1;
			
	}

}
