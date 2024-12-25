package solutionsLeetCode;
import java.util.*;

public class lengthLastStringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.length());
		
		System.out.print(lastWordLength(s));

	}
	public static int lastWordLength(String s) {
		int count=0;
		int len=s.length()-1;
//		System.out.println(len+1);
		while(len>=0 && s.charAt(len)== ' ') {
			len--;
		}
		while(len>=0 && s.charAt(len)!=' ') {
			count++;
			len--;
		}
		return count;
	}

}
