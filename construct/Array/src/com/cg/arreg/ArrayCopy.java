package com.cg.arreg;
import java.util.Scanner;
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the 10 digit value ");
		 int n=sc.nextInt();
		 int arr[]= new int[n];
		 for(int i=0;i<arr.length;i++)
		 {
			arr[i]=sc.nextInt();
		 }
		 for(int element:arr)
		 {
			 System.out.println(element);
		 }
		 int newValue[]=new int[arr.length];
		 for(int i=arr.length-1;i>0;i--)
		 {
			 for(int j=0;j<newValue.length;j++)
			 {
				 newValue[i]=arr[j];
			 }
		 }
		 for(int v:newValue)
		 {
			 System.out.println("the reversed stored value is "+v);
		 }
			}
	}


