package com.MS.test;

public class BinarySearch {
	
	
	public int BSearch(int arr[],int key,int low,int high) {
		
		if (high>=1) {
		int mid=(low+high)/2;
		if(arr[mid]==key) {
			return mid;
		}
		else if(arr[mid]>key) {
			return BSearch(arr, key, low,mid-1);
			
			
		}
		else if(arr[mid]<key) {
			
			return BSearch(arr, key, mid+1, high);
		}
		}
		return -1;
	
		
		
	} 
	
	public static void main(String[] args) {
		BinarySearch b=new BinarySearch();
		int arr[]= {1,2,4,6,9,13,16,18};
		int key=16;
		int leng=arr.length;
		int a=b.BSearch(arr, key, 0, leng-1);
		if(a==-1)
		System.out.println("ELEMENT NOT FOUND");
		else
			System.out.println("ELEMENT IS FOUND IN THE LOCATION "+a);
				
				
	}

}
