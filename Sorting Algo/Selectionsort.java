package com.MS.test;

public class Selectionsort {
	
	public void SSort(int a[],int l) {
		
		for(int i=0;i<l-1;i++) {
			int min=i;
			for(int j=i+1;j<l;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
				
			}
			
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Selectionsort s=new Selectionsort();
		int arr[]= {20,11,4,12,6,17};
		int leng=arr.length;
		s.SSort(arr, leng);
		for(int k=0;k<leng;k++) {
			System.out.println(arr[k]);
		}
		

	}
	

}
