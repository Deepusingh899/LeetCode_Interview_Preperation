package solutionsLeetCode;
import java.util.*;

public class InsertionPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int target=sc.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int pos=insertPosition(a,target);
		System.out.print(pos);

	}
	public static int insertPosition(int []a,int value) {
		int first=0;
		int last=a.length-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if(a[mid]<value) {
				first=mid+1;
			}
			else if(a[mid]>value) {
				last=mid-1;
			}
			else {
				return mid;
			}
		}
		return first;
		
	}

}
