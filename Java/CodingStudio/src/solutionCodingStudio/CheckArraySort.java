package solutionCodingStudio;

import java.util.Scanner;

public class CheckArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(checkArrayOrder(arr));

	}

	private static String checkArrayOrder(int[] a) {
		// TODO Auto-generated method stub
		int len=a.length;
		for(int i=1;i<len;i++) {
			if(a[i]<a[i-1]) {
				return "Array is not sorted";
			}
		}
		return "Array is Sorted";
	}

}
