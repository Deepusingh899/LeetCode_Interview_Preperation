package solutionsLeetCode;
import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();	
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int key=sc.nextInt();
		TwoSum ts=new TwoSum();
		int []arr1=ts.twoSum(arr,key);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

	private int[] twoSum(int[] arr, int key) {
		// TODO Auto-generated method stub
		int []arr1=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==key) {
					arr1[0]=i;
					arr1[1]=j;
				}
				
			}
		}
		return arr1;
	}

}
