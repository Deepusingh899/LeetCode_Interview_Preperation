package solutionCodingStudio;

import java.util.Arrays;
import java.util.Scanner;

//import sun.security.util.Length;

class second {
 public static int[] getSecondOrderElements(int n, int []a) {
	 
	 
	 //Optimal Solution With O(N) Time Complexity for both second min and second Largest
     int largest=a[0];
     int secLargest=Integer.MIN_VALUE;
     int minimum=a[0];
     int secMinimum=Integer.MAX_VALUE;
     int arr1[]=new int[2];
     for(int i=0;i<n;i++){
    	if(a[i]>largest){
    		secLargest=largest;
			largest=a[i];
		}else if(a[i]<largest && a[i]>secLargest){
			secLargest=a[i];
		}
     }
     // System.out.print(secMinimum);
     for(int i=0;i<n;i++){
        if(a[i]<minimum){
            secMinimum=minimum;
            minimum=a[i];
        }else if(a[i]>minimum && a[i]<secMinimum){
            secMinimum=a[i];
        }
     }
     arr1[0]=secLargest;
     arr1[1]=secMinimum;
	 return arr1;
	 
	 
	 
	 /*
	// Bruteforce Solutions with O(NlogN) time complexity for both second largest and the second minimum	
	Arrays.sort(a);
	int secLargest=a[n-1];
	int secMinimum=a[0];
	int arr[]=new int[2];
	for(int i=n-1;i>0;i--) {
		if(a[i]!=secLargest) {
			secLargest=a[i];
			break;
		}
	}
	if(secLargest==a[n-1]) {
		secLargest=-1;
	}
	for(int i=0;i<n;i++) {
		if(a[i]!=secMinimum) {
			secMinimum=a[i];
			break;
		}
	}
	if(secMinimum==a[0]) {
		secMinimum=-1;
	}
	arr[0]=secLargest;
	arr[1]=secMinimum;
	return arr;*/
	 
	 
	
 	/*
 	// Better Solution With O(2N) time complexity for both second largest and the second minimum element in the array
	int max=a[0];
	int min=a[0];
	int secLargest=-1;
	int secMinimum=-1;
	int arr[]=new int[2];
	for(int i=0;i<n;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	for(int i=0;i<n;i++) {
		if(a[i]!=max && (secLargest==-1 || a[i]>secLargest)) {
			secLargest=a[i];
		}
	}
	for(int i=0;i<n;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	for(int i=0;i<n;i++) {
		if(a[i]!=min && (secMinimum==-1 || a[i]<secMinimum)) {
			secMinimum=a[i];
		}
	}
	arr[0]=secLargest;
	arr[1]=secMinimum;
	return arr;*/		
 }
}
public class secondOrderElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		second sol=new second();		
		int a[]=sol.getSecondOrderElements(n,arr);		
		for(int res : a) {
			System.out.print(res+" ");
		}
		

	}

}
