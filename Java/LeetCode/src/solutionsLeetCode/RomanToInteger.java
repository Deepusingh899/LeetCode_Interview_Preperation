package solutionsLeetCode;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		RomToInt sol=new RomToInt();
		int result=sol.romanToInt(s);
		System.out.print(result);;

	}

}
class RomToInt{
	public int romanToInt(String s) {
		HashMap<Character,Integer> map= new HashMap<>();
		int sum=0;
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		s=s.replace("IV","IIII");
		s=s.replace("IX","VIIII");
		s=s.replace("XL","XXXX");
		s=s.replace("XC","LXXXX");
		s=s.replace("CD","CCCC");
		s=s.replace("CM","DCCCC");
		for(int i=0;i<s.length();i++) {
			sum=sum+map.get(s.charAt(i));
		}
	
		
		return sum;
		
	}
}
