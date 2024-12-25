package solutionCodingStudio;
import java.util.*;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int a[]=uniqueElement(arr,n);
		System.out.print("Unique Element :- ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static int[] uniqueElement(int[] arr, int n) {
		/*
		//With Brute Force with O(NlogN) time Complexity and O(N) Space Complexity
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			s.add(arr[i]);
		}
		System.out.print("Set :- "+s+"\n");
		int i=0;
		for(int e:s) {
			arr[i]=e;
			i++;
		}
		System.out.println("Number of Unique Element :- "+i);
		return Arrays.copyOfRange(arr, 0, s.size());*/
		
		// Optimal Solution with O(N) Time Complexity and O(1) Space Complexity
		int i=0;
		for(int j=1;j<n;j++) {
			if(arr[i]!=arr[j]) {
				arr[i+1]=arr[j];
				i++;
				
			}
		}
		System.out.println("Number of Unique Element "+(i+1));
		return Arrays.copyOfRange(arr, 0, i+1);
	}
}
