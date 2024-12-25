package solutionsLeetCode;
import java.util.*;

public class RemoveDup {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		int [] arr1= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Print Array");
		System.out.print("[ ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		
		Duplicate rm=new Duplicate();		
		int count=rm.removeDuplicate(arr);
		boolean isSame=false;
		// Gtting Unique Value First
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(c==0) {
				arr1[c]=arr[0];
				c++;
			}else {
				if(arr[i-1]!=arr[i]) {
					arr1[c]=arr[i];
					c++;
				}
			}
		}
		System.out.println("\n\nAfter Getting Unique Value First:-  ");
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Print The only Unique Value
		System.out.print("]");
		System.out.println("\n\nOnly Unique Value:-  ");
		System.out.print("[ ");
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+" ");
			if(arr1[i]==arr[i]) {
				isSame=true;
			}
		}
		System.out.print("]\n\n");
		System.out.println(isSame);
        
	}
}

class Duplicate {

	public int removeDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(count==0) {
				arr[count]=arr[i];
				count++;
			}else {
				if(arr[i-1]!=arr[i]) {
					arr[count]=arr[i];
					count++;
				}
			}
		}
		return count;
	}

}
