package solutionsLeetCode;
import java.util.*;

public class Valid_Parantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		Solutions sol=new Solutions();
		System.out.println(sol.isValid(s));
		
	}

}

class Solutions{
	public boolean isValid(String s) {
		Stack<Character> st= new Stack<>();
		for(char i:s.toCharArray()) {
			if(i=='(')
				st.push(')');
			else if(i=='{')
				st.push('}');
			else if(i=='[')
				st.push(']');
			else if(st.isEmpty() || st.pop()!=i){
				return false;
			}
		}
//		for(int i=0;i<s.length();i++) {
//			s= s.replace("{}", "")
//				.replace("()", "")
//				.replace("[]", "");
//		}
		
		return st.isEmpty();		
	}
	
}
