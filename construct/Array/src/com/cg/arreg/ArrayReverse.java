package com.cg.arreg;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		 int l=arr.length;
		 int temp;
		 int n=Math.floorDiv(l, 2);
		 for(int i=0;i<n;i++)
		 {
			 temp=arr[i];
			 arr[i]=arr[l-i-1];
			 arr[l-i-1]=temp;
		 }
		 for(int element:arr) {
			 System.out.print(element+" ");
		 }
			}

	}


